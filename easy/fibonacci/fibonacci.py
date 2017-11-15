# Makes Python 2.x and 3.x play nice.
try: input = raw_input
except NameError: pass

def fib_iter(n):
    prev = 1
    curr = 0
    for i in range(n):
        temp = curr
        curr += prev
        prev = temp
    return curr

def fib_recur(n):
    if n == 1 or n == 2:
        return 1
    return fib_recur(n-1)+fib_recur(n-2)

print(fib_iter(int(input("Enter an integer greater than 0: "))))