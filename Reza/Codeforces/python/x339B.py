nm = list(map(int, input().split(" ")))
n = nm[0]
m = nm[1]
 
m_list = list(map(int, input().split(" ")))
 
curr = 1
sum = 0
for el in m_list:
    dif = abs(el - curr)
    if curr > el:
        dif = n - dif
    sum += dif
    curr = el
print(sum)