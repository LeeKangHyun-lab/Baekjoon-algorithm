import sys

chess = []

n, m = map(int, sys.stdin.readline().split())

for x in range(n):
    unit = list(sys.stdin.readline().strip())
    chess.append(unit)

w_first = []
for i in range(8):
    row = []
    for j in range(8):
        if((i + j) % 2 == 0):
            row.append('W')
        else:
            row.append("B")
    w_first.append(row)

b_first = []
for i in range(8):
    row = []
    for j in range(8):
        if((i + j) % 2 == 0):
            row.append('B')
        else:
            row.append("W")
    b_first.append(row)

        
min_cnt = float('inf')

def change(i, j, pattern):
    cnt = 0
    for x in range(8):
        for y in range(8):
            if chess[i + x][j + y] != pattern[x][y]:
                cnt += 1
    return cnt

for i in range(n - 7):
    for j in range(m - 7):
        change_w = change(i, j, w_first)
        change_b = change(i, j, b_first)
        
        min_cnt = min(min_cnt, change_w, change_b)

print(min_cnt)
        

