num1 = int(input("Please enter a number:"))
sym = input("Please enter a symbol")
num2 = int(input("Please enter another number: "))

if sym=="+":
    print(str(num1)+"+"+str(num2)+"="+str(num1+num2))
elif sym=="-":
    print(str(num1)+"-"+str(num2)+"="+str(num1-num2))
elif sym=="/":
    print(str(num1)+"/"+str(num2)+"="+str(num1/num2))
elif sym=="*":
    print(str(num1)+"*"+str(num2)+"="+str(num1*num2))
else:
    print('Invalid symbol')


