t = int(input())

for _ in range(t):
    n = int(input())
    numbers = list(map(int, input().split(" ")))
    numbers.sort()
    flag = True
    for i in range(n-1):
        if (numbers[i+1] - numbers[i]) > 1:
            flag = False
            break
    print("YES" if flag else "NO")