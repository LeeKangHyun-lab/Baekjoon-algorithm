import sys

n, k = map(int, sys.stdin.readline().strip().split(" "))

cnt = 0
for x in range(1, n + 1):
    if n % x == 0:
        cnt += 1
        if(cnt == k):
            print(x)

if(cnt < k):
    print(0)
