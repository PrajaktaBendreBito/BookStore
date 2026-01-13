import random

for i in range(10):
    a = random.randint(1, 12)
    b = random.randint(1, 12)
    question = "What is " + a + " x " + b + "? "
    answer = input(question)
    if answer == a*b:
        print("Well done!")
    else:
        print("No.")
