n = int(input())
m_c = 0
c_c = 0

for _ in range(n):
    dices = list(map(int, input().split(" ")))
    if dices[0] > dices[1]:
        m_c += 1
    elif dices[0] < dices[1]:
        c_c += 1

if m_c == c_c:
    print("Friendship is magic!^^")
elif m_c > c_c:
    print("Mishka")
else:
    print("Chris")
