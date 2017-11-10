def fib_iter(n):
    prev = 1
    curr = 0
    for i in range(1,n):
        temp = curr
        curr += prev
        prev = temp
    return curr

def fib_recur(n):
    if n == 1 or n == 2:
        return 1
    return fib_recur(n-1)+fib_recur(n-2)

print(fib_iter(raw_input("Enter an integer greater than 0: ")))