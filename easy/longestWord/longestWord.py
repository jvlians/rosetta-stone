# Makes Python 2.x and 3.x play nice.
try: input = raw_input
except NameError: pass

def longestWord(sentence):
    words = sentence.split(" ")
    longest = ""
    max = 0
    for word in words:
        count = 0
        temp = ""
        for c in word:
            if (c >= 'a' and c <= 'z') or (c >= 'A' and c <= 'Z'):
                count += 1
                temp += c
        if (count > max):
            longest = temp
            max = count
    return longest

print(longestWord(input("Enter a String: ")))