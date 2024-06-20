n = int(input())
Z = 0
 
for _ in range(n):
    
    petya, vasya, tonya = map(int, input().split())
    
  
    if petya + vasya + tonya >= 2:
        Z += 1 
print(Z)
