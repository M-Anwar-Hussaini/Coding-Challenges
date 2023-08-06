a = int(input())
b = int(input())
c = int(input())

m_list = [a, b ,c]

one_count = m_list.count(1)

if one_count == 3 or (one_count == 2 and m_list[1] != 1):
    print(sum(m_list))
elif one_count == 0:
    print(a*b*c)
elif one_count == 2:
    print((sum(m_list)-2)*2)
else:
    if m_list.index(1) == 1:
        m_list.sort()
        result = (m_list[0] + m_list[1]) * m_list[2]
        print(result)
    elif m_list.index(1) == 0:
        print((m_list[0] + m_list[1])*m_list[2])
    else:
        print(m_list[0]*(m_list[1] + m_list[2]))