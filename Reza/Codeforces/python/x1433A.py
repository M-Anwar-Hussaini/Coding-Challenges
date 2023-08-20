import math

t = int(input())
def fac(n):
    if n==1:
        return 1
    return n + fac(n-1)

for _ in range(t):
    n = input()
    fn = int(n[0])
    res = (fn -1) * 10
    res += fac(len(n))
    print(res)
