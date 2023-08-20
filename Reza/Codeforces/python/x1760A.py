t = int(input())

for _ in range(t):
    nums = list(map(int, input().split()))
    nums.sort()
    print(nums[1])