num1 = input("Enter a number: ")
line = input("Do you want a vertical or horizontal line: ")

oppa = 0

if line == "vertical" or line == "v":
    for oppa in range (0,int(num1)):
        print("*")


elif line == "horizontal" or line =="h":
    for oppa in range (0,int(num1)):
      print("*", end=" ")
      
else:
    print("That aint possible boi")