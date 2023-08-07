inp = input()
if inp != '{}':
    print(len(set(list(map(str, inp.strip('{}').split(', '))))))
else:
    print(0)
