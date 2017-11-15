# Makes Python 2.x and 3.x play nice.
try: input = raw_input
except NameError: pass

def twoSum(nums, target):
    dict = {}
    for i in range(len(nums)):
        if target-nums[i] in dict:
            return [dict[target-nums[i]],i]
        else:
            dict[nums[i]] = i
    return [0,0]

print(twoSum(eval(input("Enter an array of integers: ")),int(input("Enter a target integer: "))))