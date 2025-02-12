import sys

bucket = []
n, m = map(int, sys.stdin.readline().split())


for i in range(1, n+1):
    bucket.append(i)

for x in range(m):
    i, j = map(int, sys.stdin.readline().split())


    bucket[i - 1 : j] = reversed(bucket[i - 1 : j])

for x in bucket:
    print(x,end = " ")