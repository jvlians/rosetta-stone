def fizzBuzz(n):
    for i in range(1,n):
        str = ""
        if i % 3 == 0:
            str += "Fizz"
        if i % 5 == 0:
            str += "Buzz"
        if strlen(str) == 0:
            str = i
        print str
    return

print(fizzBuzz(raw_input("Enter an integer greater than 0: ")))