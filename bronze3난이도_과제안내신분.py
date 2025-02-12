import sys

check =[]

for i in range(28):
    student = int(sys.stdin.readline())
    check.append(student)

for i in range(1, 31):
    if i not in check:
        print(i)
        