t = int(input())

for _ in range(t):
    nums = list(map(int, input().split(" ")))
    dif = abs(nums[0] - nums[1])
    result = 0
    if dif <= 10 and nums[0] != nums[1]:
        print(1)
    else:
        print(int((dif/10) + (1 if dif%10!=0 else 0)))
