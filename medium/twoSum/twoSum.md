# Problem
You are given an array of integers and a single integer.
You must then determine whether or not two integers in
the array provided can yield a sum equal to the integer
taken as a second parameter. If there is a combination
that yields the desired sum, you should return the
two indices of the numbers in the array that, when
added together, result in the sum.

## Input
Input is given in the form of an integer array, and a
single integer.

## Output
Your function should return an array with two values
representing the indices of the values in the array
whose total yields the target sum. The first index
should be less than the second. If there is no match,
return an array of `[0,0]`.

#### Example 1

Input values: `[3,4,9,2,5]`, `12`

Expected output: `[0,2]`

#### Example 2

Input value: `[19,21,2,8,-1,3]`, `7`

Expected output: `[3,4]`

#### Example 3

Input value: `[19,21,2,8,-1,3]`, `0`

Expected output: `[0,0]`