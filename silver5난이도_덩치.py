import sys

size = []

n = int(sys.stdin.readline())

for x in range(n):
    xy = list(map(int, sys.stdin.readline().strip().split()))
    size.append(xy)

for i in range(n):
    cnt = 0
    for j in range(n):
        if size[i][0] < size[j][0] and size[i][1] < size[j][1]:
            cnt += 1

    print(cnt + 1, end = " ")