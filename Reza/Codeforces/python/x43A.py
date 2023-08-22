t = int(input())

teams = set()
res = []
for i in range(t):
    team = input()
    teams.add(team)
    res.append(team)
teams_l = list(teams)
if(len(teams_l)==1):
    print(teams_l[0])
else:
    fTeam = res.count(teams_l[0])
    sTeam = res.count(teams_l[1])

    print(teams_l[0] if fTeam > sTeam else teams_l[1])