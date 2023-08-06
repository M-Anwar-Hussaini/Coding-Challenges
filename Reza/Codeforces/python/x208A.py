import re

in_str = input()
result = re.sub('WUB', ' ', in_str)

print(result.strip())