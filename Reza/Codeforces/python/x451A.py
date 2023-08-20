nm = list(map(int, input().split(" ")))
res = min(nm)
print("Akshat" if res&1 else "Malvika")