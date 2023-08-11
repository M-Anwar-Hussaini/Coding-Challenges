f = list(map(int, input().split(" ")))
s = f[0]
n = f[1]
m_dic = {}
for i in range(n):
    sec = list(map(int, input().split(" ")))
    x = sec[0]
    y = sec[1]
    if x not in m_dic:
        m_dic[x] = y
    else:
        y = y + m_dic[x]
        m_dic[x] = y


sorted_dic = sorted(m_dic.items())

flag = True
for key, value in sorted_dic:
    if s <= key:
        print("NO")
        flag = False
        break
    else:
        s = s + value

if flag:
    print("YES")