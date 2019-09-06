# -*- coding: utf-8 -*-
"""
Created on Thu Dec 21 08:40:23 2017

@author: dell
"""

class Person:
    def __init__(self):
        self.name = "Bob"
        self.age = 17
    def getname(self):
        return self.name
    def eat(self,food):
        return str(self.age) + self.name + " eats " + food
    
bob = Person()
result = bob.getname()
print(result)
dinner = bob.eat("")
print(dinner)