n = int(input())
m_list =list(map(int, input().split(' ')))

m_list = [(int(num) & 1) for num in m_list]

ones = m_list.count(1)
zeros = m_list.count(0)

print(m_list.index(0) + 1 if ones > zeros else m_list.index(1) + 1)
