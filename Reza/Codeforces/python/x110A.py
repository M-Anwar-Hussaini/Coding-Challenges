import re

in_str = input()

lucky = str(in_str.count('4') + in_str.count('7'))

if bool(re.search(r'[^47]', lucky)):
    print("NO")
else:
    print("YES")
