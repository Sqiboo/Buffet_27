sym = input("What symbol do you want to use?: ")
w = int(input("What width do you want?: "))
l = int(input("What length do you want?: "))
for i in range (w):
    for r in range (l):
        print(sym, end=" ")
    print()
