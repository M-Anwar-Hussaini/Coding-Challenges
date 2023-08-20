n, k, l, c, d, p, nl, np = map(int, input().split())

res1 = int((k*l)/nl)
res2 = int(c*d)
res3 = int(p/np)

min_toast = min(res2, res3, res1)

print(int(min_toast/n) if min_toast >= n else 0)