n = input()

if n[0] !='-':
    print(n)
else:
    ld = n[-1]
    bld = n[-2]
    if int(ld) > int(bld):
        n = "".join(ch for ch in n)
    else:
        n = n.replace(bld, "")
    print(n if int(n) != 0 else 0)