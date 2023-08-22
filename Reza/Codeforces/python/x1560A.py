t = int(input())
m_list = []
el = 1
for j in range(1000):
    lastDigit = el%10
    if el%3!=0 and lastDigit!=3:
        m_list.append(el)
        el+=1
    else:
        el+=1
        if el%10==3 or el%3==0:
            el+=1
        m_list.append(el)
        el+=1

for i in range(t):
    n = int(input())
    print(m_list[n-1])