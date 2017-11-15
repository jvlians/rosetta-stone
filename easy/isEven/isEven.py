# Makes Python 2.x and 3.x play nice.
try: input = raw_input
except NameError: pass

def isEven(n):
    return n % 2 == 0

print(isEven(int(input("Enter an integer: "))))