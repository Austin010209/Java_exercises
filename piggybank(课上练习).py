# -*- coding: utf-8 -*-
"""
Created on Thu Dec 21 08:36:51 2017

@author: dell
"""

class Piggybank:
    def __init__(self):
        self.quarters = 0
        self.nickels = 0
        self.dimes = 0
        self.pennies = 0
        
    def insertquarter(self):
        self.quarters += 1
        
    def insertdime(self):
        self.dimes += 1
        
    def insertnickel(self):
        self.nickels += 1
        
    def insertpenny(self):
        self.pennies += 1
        
    def smashbank(self):
        totalcents = self.quarters*25 + self.dimes*10+ self.nickels*5+self.pennies
        return totalcents 
    
    def __str__(self):
        result = ""
        result += "Quarters: " + str(self.quarters) + "\n"
        result += "Dimes: " + str(self.dimes) + "\n"
        result += "Nickels: " + str(self.nickels) + "\n"
        result += "Pennies: " + str(self.pennies) + "\n"
        return result
    
#create an object from the class Piggybank
bank = Piggybank()
for i in range(5):
    bank.insertdime()
bank.insertquarter()
bank.insertpenny()
bank.insertpenny()
bank.insertnickel()
bank.insertdime()
print(bank)
savings = bank.smashbank()
print("You saved: " + str(savings))






class Piggybank():
    def __init__(self):
        self.penny = 0
        self.nickel = 0
        self.dime = 0
        self.quarter = 0
        self.total = 0
    def insertpenny(self):
        self.penny = self.penny + 1
    def insertnickle(self):
        self.nickel = self.nickel + 1
    def insertdime(self):
        self.nickel = self.nickel + 1
    def insertquarter(self):
        self.quarter = self.quarter + 1
    def smashbank(self):
        self.total = self.total + self.penny + 10 * self.nickel + self.dime * 5 + self.quarter * 25
    def __str__(self):
        result = ""
        if self.penny == 1 or self.penny == 0:
            result = result + "You have %d penny\n" %self.penny
        else:
            result = result + "You have %d pennies\n" %self.penny
        if self.nickel == 1 or self.nickel == 0:
            result = result + "You have %d nickel\n" %self.nickel
        else:
            result = result + "You have %d nickels\n" %self.nickel
        if self.dime == 1 or self.dime == 0:
            result = result + "You have %d dime\n" %self.dime
        else:
            result = result + "You have %d dimes\n" %self.dime
        if self.quarter == 0 or self.quarter == 1:
            result = result + "You have %d quarter\n" %self.quarter
        else:
            result = result + "You have %d quarters\n" %self.quarter
        result = result + "You have %d cents in total\n" %self.total
        result = result + "That is %d dollars and %d cents\n" %((self.total//100),(self.total%100))
        return result
bank = Piggybank()
for i in range(3):
    bank.insertpenny()
for i in range(5):
    bank.insertquarter()
for i in range(4):
    bank.insertnickle()
for i in range(2):
    bank.insertdime()
bank.smashbank()
print(bank)