n = int(input())
s = input()
 
anton_wins = s.count('A')
danik_wins = s.count('D')
 
if anton_wins > danik_wins:
    print("Anton")
elif danik_wins > anton_wins:
    print("Danik")
else:
    print("Friendship")