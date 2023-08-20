n = int(input())
x = 0
maxV = 0
for i in range(n):
    ab = list(map(int, input().split(" ")))
    res = (x + ab[1]) - ab[0]
    x = res
    if maxV < res:
        maxV = res
print(maxV)