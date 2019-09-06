# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 22:59:36 2019

@author: Xueyang Zhang (Austin)
This file is to get the average loan amount per home ownership
in two files, which one of them clarifies the type, and another one 
specifies the amount.
"""
import numpy
import matplotlib.pyplot as plt
k = -1
q = -1    #k and q are for avoiding the title of the form
sumM = 0
sumR = 0
sumO = 0    #sum for mortgage,rent and own
M = 0
R = 0
O = 0       #number of mortgage, rent and own
shand = open("home_ownership_data.csv")  #open the small file
types = ["MORTGAGE","RENT","OWN"]      #ready to classify members
pair = {}       #a dictionary to pair member and type(to store information from the small file)
for line in shand:
    line = line.rstrip()
    if q>-1:
        q+=1
        a = line.find(",")
        memberid = line[0:a]     #get memberid
        ownership = line[a+1:]    #get ownership
        pair[memberid] = ownership     #pair by dictionary
    else:
        q+=1
fhand = open("loan_data.csv")   #the dictionary is complete and ready. open the big file to fetch amount
for line in fhand:
    line = line.rstrip()      #clarify each line of the file
    if k>-1 :
        k+=1
        a = line.find(",")           #lock up position of memberid and amount
        b = (line[a+1:]).find(",")   #lock up position of amount
        MId = line[0:a]              #fetch memberid
        Type = pair[MId]             #fetch type in dictionary by id
        loan = (line[a+1:])[0:b]     #get amount, and begin to classify
        if Type == "MORTGAGE":
            M+=1                        #finally get total number of mortgage
            sumM = sumM + int(loan)     #finally get total amount of loan
        elif Type == "RENT":
            R+=1
            sumR = sumR + int(loan)
        elif Type == "OWN":
            O+=1
            sumO = sumO + int(loan)
    else:
        k+=1
data = (sumM/M,sumO/O,sumR/R)         #the data is all set
ind = numpy.arange(3)
plt.bar(ind, data,0.57)
plt.ylabel("Average loan amount ($)")
plt.xlabel("Home ownership")
plt.title("Average loan amount per home ownership")
plt.xticks(ind, ("MORTGAGE","OWN","RENT"))     #replace number by type in words
plt.show()