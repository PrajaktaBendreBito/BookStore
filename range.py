import random

numbers = []
for i in range(1, 10):       # supposed to generate 10 numbers
    n = input("Enter a number: ")
    numbers.append(n)

total = 0
for num in numbers:
    total += num             # wrong: num is string

print("Total is", total)
