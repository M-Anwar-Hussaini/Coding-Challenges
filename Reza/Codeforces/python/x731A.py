s = input()

current = 'a'
sum = 0
for i in s:
    dif = abs(ord(current) - ord(i))
    if dif > 13:
        dif = 26 - dif
    current = i
    sum += dif
print(sum)