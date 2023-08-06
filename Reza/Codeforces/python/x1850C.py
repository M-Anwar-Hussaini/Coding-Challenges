import re
t = int(input())

for _ in range(t):
    print(re.sub(r'[.]', '', input() + input() + input() + input() + input() + input() + input() + input()))
