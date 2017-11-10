# Problem
You are given an integer `i` in the range `[1,n]`. You
should then print every number between 1 and `i`,
inclusive, where each number gets its own line.
However, if the number is divisible by 3, you should
print "Fizz" instead of the number. Additionally, if the
number is divisible by 5, then the printed String should
be "Buzz" instead of the number. Lastly, if the number
is divisible by both 3 and 5, you should print
"FizzBuzz".

*NOTE*: Each printed line should ONLY contain either
the integer, "Fizz", "Buzz", or "FizzBuzz".

## Input
Input is given in the form of a single integer.

## Output
Your function should return nothing, and instead print
every number in the `[1,i]` range, where `i` is the
input integer. However, if the number is a
multiple of 3, print "Fizz"; if the number is a
multiple of 5, print "Buzz"; if the number is a
multiple of both 3 and 5, print "FizzBuzz".

#### Example

Input value: `16`

Expected output:
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
```