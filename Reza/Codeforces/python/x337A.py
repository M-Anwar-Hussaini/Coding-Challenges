sAndp = list(map(int, input().split(' ')))
n = sAndp[0]
m = sAndp[1]

m_list = list(map(int, input().split(' ')))
m_list.sort()
itN = m - n + 1
min_dist = m_list[n-1] - m_list[0]
for i in range(itN):
    dist = m_list[i+n-1] - m_list[i]
    if min_dist > dist:
        min_dist = dist

print(min_dist)