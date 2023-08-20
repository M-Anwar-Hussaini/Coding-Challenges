t = int(input())

for _ in range(t):
    n = input()
    c = 0
    d_list = []
    for i in range(len(n)):
        if n[i] != '0':
            z = len(n) - (i+1)
            d_list.append(n[i] + ('0'*z))
            c = c+1
    print(c)
    print(' '.join(map(str, d_list)))