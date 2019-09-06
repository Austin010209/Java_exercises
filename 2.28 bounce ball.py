#有挡板(paddle)的球
from graphics import *
class Ball:
    def __init__(self,paddle,win):
        self.win = win
        self.paddle = paddle
        self.vel = [10,5]
        self.ball = Circle(Point(200,200),20)
    def sketch(self):
        self.ball.setFill("black")
        self.ball.draw(self.win)
    def animate(self):
        self.ball.move(self.vel[0],self.vel[1])
        point1 = self.ball.getP1()
        point2 = self.ball.getP2()
        center = self.ball.getCenter().getY()
        padlower = self.paddle.lower()
        padupper = self.paddle.upper()
        if point1.getX() < 10:
            if padlower<center and padupper>center:
                self.vel[0] *= -1
            else:
                self.ball.move(300,0)
        elif point2.getX() > 600:
            self.vel[0] *= -1
        elif point1.getY() < 0 or point2.getY() > 400:
            self.vel[1] *= -1
        self.win.after(20,self.animate)

class Paddle:
    def __init__(self,win):
        self.vel = 0
        self.win = win
        self.paddle = Rectangle(Point(0, 160), Point(10, 240))
    def sketch(self):
        self.paddle.setFill("black")
        self.paddle.draw(self.win)
    def animate(self):
        point1 = self.paddle.getP1()
        point2 = self.paddle.getP2()
        if point1.getY() + self.vel >= 0 and point2.getY() + self.vel <= 400:
            self.paddle.move(0,self.vel)
        self.win.after(20,self.animate)
        
    def lower(self):
        return self.paddle.getP1().getY()
    def upper(self):
        return self.paddle.getP2().getY()
    def rise(self,event):
        self.vel = -20
    def fall(self,event):
        self.vel = 20
    def stop(self,event):
        self.vel = 0

win = GraphWin("Pong:Single Player", 600,400)
win.setBackground("white")
racket = Paddle(win)
racket.sketch()
racket.animate()
sphere = Ball(racket,win)
sphere.sketch()
sphere.animate()
win.bind_all("<a>",racket.rise)
win.bind_all("<z>",racket.fall)
win.bind_all("<KeyRelease-a>",racket.stop)
win.bind_all("<KeyRelease-z>",racket.stop)
win.getMouse()
win.close()




#加了一些内容

from graphics import *
class Paddle:
    def __init__(self,win):
        self.win = win
        self.velocity = 0
        self.paddle = Rectangle(Point(0,100),Point(10,180))
    def sketch(self):
        self.paddle.setFill("red")
        self.paddle.draw(self.win)
    def animate(self):
        Point1 = self.paddle.getP1()
        Point2 = self.paddle.getP2()
        if Point1.getY() < 20:
            self.paddle.move(0,10+self.velocity* -1)
        if Point2.getY() > 480:
            self.paddle.move(0,-10-self.velocity* -1)
        if Point1.getY() + self.velocity > 10 or Point2.getY() + self.velocity< 490:
            self.paddle.move(0,self.velocity)
        self.win.after(60,self.animate)
    def lower(self):
        return self.paddle.getP2().getY()
    def upper(self):
        return self.paddle.getP1().getY()
    def rise(self,event):
        self.velocity = -20
    def down(self,event):
        self.velocity = 20
    def stop(self,event):
        self.velocity = 0

class Ball:
    def __init__(self,win,paddle):
        self.win = win
        self.vel = [10,-15]
        self.paddle = paddle
        self.ball = Circle(Point(250,250),20)
        self.m = 0
        self.n = 0
    def sketch(self):
        self.ball.setFill("orange")
        self.ball.draw(self.win)
    def animate(self):
        point1 = self.ball.getP1()
        point2 = self.ball.getP2()
        center = self.ball.getCenter().getY()
        padlower = self.paddle.lower()
        padupper = self.paddle.upper()
        self.ball.move(self.vel[0],self.vel[1])
        if point1.getX() <= 20 and center > padupper and center < padlower and point1.getX() > 18:
            if self.m == self.n:
                self.vel[0] = self.vel[0] * -1
            else:
                self.m = self.n
                self.vel[0] = self.vel[0]
        if center > padupper and center < padlower and point1.getX() < 21 and point1.getX() > 6:
            self.vel[0] = self.vel[0] * -1
            self.n = self.n + 1
        elif self.ball.getP2().getX() > 490:
            self.vel[0] = self.vel[0] * -1
        elif self.ball.getP1().getY() < 10:
            self.vel[1] = self.vel[1] * -1
        elif self.ball.getP2().getY() > 490:
            self.vel[1] = self.vel[1] * -1
        self.win.after(60,self.animate)
    def faster(self,event):
        self.vel[0] = self.vel[0] * 1.2
        self.vel[1] = self.vel[1] * 1.2
    def slower(self,event):
        self.vel[0] = self.vel[0] * 0.8
        self.vel[1] = self.vel[1] * 0.8
win = GraphWin("Application",500,500)
racket = Paddle(win)
racket.sketch()
racket.animate()
bounceball = Ball(win,racket)
bounceball.sketch()
bounceball.animate()                
win.bind_all("<w>",racket.rise)
win.bind_all("<s>",racket.down)
win.bind_all("<KeyRelease-w>",racket.stop)
win.bind_all("<KeyRelease-s>",racket.stop)
win.bind_all("<Up>",bounceball.faster)
win.bind_all("<Down>",bounceball.slower)
win.getMouse()
win.close()