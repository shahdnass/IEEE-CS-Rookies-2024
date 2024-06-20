s = input().strip()   
n = int(s, 2)   
 
counter = 0
power_of_4 = 1
 
 
while power_of_4 < n:
    power_of_4 *= 4
    counter += 1
 
print(counter)