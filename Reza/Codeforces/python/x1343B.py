t = int(input())

for _ in range(t):
    n = int(input())
    if n%2!=0:
        print("NO")
    else:
        de = n/2
        if de%2==0:
            print("YES")
            arr = []
            sum1 = 0
            sum2 = 0
            for i in range(2, n+1, 2):
                arr.append(i)
            sum1 = sum(arr)
            for j in range(1, n, 2):
                arr.append(j)
                sum2 +=j
            dif = sum1-sum2
            arr[-1] += dif
            print(' '.join(map(str, arr)))
        else:
            print("NO")
