import sys

sort_n = []

n = int(sys.stdin.readline().strip())

for x in range(n):
    num = int(sys.stdin.readline().strip())
    sort_n.append(num)

sort_n.sort()

for x in sort_n:
    print(x)