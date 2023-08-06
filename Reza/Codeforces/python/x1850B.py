t = int(input())

for _ in range(t):
    n = int(input())
    max = 0
    max_index = 0
    for i in range(n):
        m_list = list(map(int, input().split(' ')))
        if m_list[0] <= 10:
            if m_list[1] > max:
                max = m_list[1]
                max_index = i + 1
    print(max_index)