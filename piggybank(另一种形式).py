# -*- coding: utf-8 -*-
"""
Created on Thu Dec 21 10:34:49 2017

@author: dell
"""

class Piggybank:
    def __init__(self):
        self.penny = 0
        self.nickle = 0
        self.dime = 0
        self.quarter = 0
        self.total = 0
    
    def insertPenny(self,numberpenny):
        self.penny = self.penny + numberpenny
        self.total = self.total + 0.01 * numberpenny
        
    def insertNickle(self,numbernickle):
        self.nickle = numbernickle + self.nickle
        self.total = self.total + numbernickle * 0.05
    
    def insertDime(self,numberdime):
        self.dime = numberdime + self.dime
        self.total = self.total + 0.1 * numberdime
    
    def insertQuarter(self,numberquarter):
        self.quarter = numberquarter + self.quarter
        self.total = self.total + 0.25 * numberquarter
        
    def SmashBank(self):
        return self.total
    
    def __str__(self):
        answer = "Number of Penny: " + str(self.penny) +"\n"
        answer = answer + "Number of Nickle: " + str(self.nickle) + "\n"
        answer = answer + "Number of Dime: " + str(self.dime) + "\n"
        answer = answer + "Number of Quarter: " + str(self.quarter) + "\n"
        answer = answer + "Number of Penny: " + str(self.penny) + "\n"
        return answer
bank = Piggybank()
bank.insertQuarter(2)
bank.insertPenny(3)
bank.insertDime(3)
bank.insertNickle(1)
bank.insertNickle(2)
result = bank.total
print(result)
print(bank)