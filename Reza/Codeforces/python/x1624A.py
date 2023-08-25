t = int(input())

for _ in range(t):
    n = int(input())
    nums = list(map(int, input().split()))
    print(max(nums) - min(nums))
