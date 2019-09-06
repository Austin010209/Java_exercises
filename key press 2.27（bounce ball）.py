#只有球在动
"""
Created on Wed Feb 28 14:33:03 2018

@author: dell
"""

from graphics import *
class Ball:
    def __init__(self,win):
        self.win = win
        self.vel = [-15,10]
        self.ball = Circle(Point(200,200),20)
    def sketch(self):
        self.ball.draw(self.win)
    def animate(self):
        self.ball.move(self.vel[0],self.vel[1])
        p1 = self.ball.getP1()
        p2 = self.ball.getP2()
        if p1.getX() < 0 or p2.getX() > 500:
            self.vel[0] = self.vel[0] * -1
        if p1.getY() < 0 or p2.getY() > 500:
            self.vel[1] = self.vel[1] * -1
        self.win.after(50,self.animate)
    def faster(self,event):
        self.vel[0] = self.vel[0] * 1.5
        self.vel[1] = self.vel[1] * 1.5
    def slower(self,event):
        self.vel[0] = self.vel[0] * 0.7
        self.vel[1] = self.vel[1] * 0.7
    def stranger1(self,event):
        self.vel[0] = self.vel[0] - 5
    def stranger2(self,event):
        self.vel[1] = self.vel[1] + 5
win = GraphWin("project", 500,500)
y = Ball(win)
y.sketch()
y.animate()
win.bind_all("<Up>",y.faster)
win.bind_all("<Down>",y.slower)
win.bind_all("<Left>",y.stranger1)
win.bind_all("<Right>",y.stranger2)
win.getMouse()
win.close()