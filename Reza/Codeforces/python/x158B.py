n = int(input())

m_list = list(map(int, input().split(' ')));

ones = m_list.count(1)
twos = m_list.count(2)
threes = m_list.count(3)
fours = m_list.count(4)

taxi_count = fours;

if twos > 1:
    taxi_count += int(twos / 2)
    twos = twos % 2

taxi_count +=threes

difOfThresAndOnes = threes - ones
ones = abs(difOfThresAndOnes)

if difOfThresAndOnes < 0:
    if twos !=0:
        taxi_count += 1
        ones -= 2

    if ones > 0:
        if ones % 4 == 0:
            taxi_count += int(ones/4)
        else:
            taxi_count = taxi_count + (int(ones/4) + 1)
else:
    taxi_count += twos

print(taxi_count)