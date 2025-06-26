n = int(input("Enter count: "))
data = []

for i in range(n+1):
    val = int(input("Value: "))
    data[i] = val

total = 0
for i in range(n):
    total =+ data[i]

print("Total:", total)
