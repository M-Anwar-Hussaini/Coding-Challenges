t = int(input())

for _ in range(t):
    n = int(input())

    condies = list(map(int, input().split()))

    ones = condies.count(1)
    twos = condies.count(2)
    print("NO" if (ones%2!=0 or (ones==0 and twos%2!=0)) else "YES")