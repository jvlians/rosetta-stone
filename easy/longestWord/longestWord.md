# Problem
You are given a String, and want to find the longest
word in the String where only alphabetic characters
contribute to the length of the words; numbers,
punctuation and other special characters should be
ignored when considering the word's length.

## Input
Input is given in the form of a single String, composed
of any characters possible.

## Output
Your function should return the word with the longest
length. This word should be the version of the word that
its length was determined off of (i.e. should only
contain alphabetic characters). If more than one word has
the same length as the longest word, you should return
the first occurrence of a word of that length.

#### Example 1

Input value: `Which word is longest?`

Expected output: `longest`

#### Example 2

Input value: `.....how about now?`

Expected output: `about`

#### Example 3

Input value: `I'm 1,000,000 years old!!!`

Expected output: `years`

#### Example 4

Input value: `I'm 2.`

Expected output: `Im`