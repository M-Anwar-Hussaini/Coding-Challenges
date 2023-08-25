import math
n, m, a, b = map(int, input().split())

mpt = b/m

if mpt >= a:
    print(int(n*a))
else:
    if m > n:
        print(min(b, n*a))
    else:
        tmc = int(n/m)
        tm = tmc * b
        rem = n%m
        if a >= b:
            tm = tm + (math.ceil(rem/m)*b)
        else:
            tm = tm + (rem*a)
        print(tm)
