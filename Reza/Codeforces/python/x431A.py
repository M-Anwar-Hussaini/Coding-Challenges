vals = list(map(int, input().split()))
stps = input()

oneCount = stps.count('1')
twoCount = stps.count('2')
threeCount = stps.count('3')
fourCount = stps.count('4')

print(oneCount*vals[0]+twoCount*vals[1]+threeCount*vals[2]+fourCount*vals[3])