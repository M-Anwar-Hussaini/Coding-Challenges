n = int(input())
m_list = []
m_dic = {}

for i in range(n):
    name = input()
    if name not in m_dic:
        m_dic[name] = 0
        print("OK")
    else:
        c = m_dic[name] + 1
        m_dic[name] = c
        print(name + str(m_dic[name]))
