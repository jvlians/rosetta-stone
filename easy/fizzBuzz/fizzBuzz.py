# Makes Python 2.x and 3.x play nice.
try: input = raw_input
except NameError: pass

def fizzBuzz(n):
    str = ""
    for i in range(1,n+1):
        temp = ""
        if i % 3 == 0:
            temp += "Fizz"
        if i % 5 == 0:
            temp += "Buzz"
        if len(temp) == 0:
            temp = i
        str += "{}\n".format(temp)
    return str

print(fizzBuzz(int(input("Enter an integer greater than 0: "))))