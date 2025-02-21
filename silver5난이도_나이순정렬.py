import sys

member = []
n = int(sys.stdin.readline().strip())

for x in range(n):
    mem_id = list(map(str, sys.stdin.readline().strip().split(" ")))
    member.append(mem_id)


member.sort(key = lambda member : int(member[0]))

for x, y in member:
    print(f'{x} {y}')