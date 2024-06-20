n, m = map(int, input().split())
 

count_mod_n = [0] * 5
for i in range(1, n + 1):
    count_mod_n[i % 5] += 1
 

count_mod_m = [0] * 5
for j in range(1, m + 1):
    count_mod_m[j % 5] += 1
 

result = 0
for x_mod in range(5):
    y_mod = (5 - x_mod) % 5
    result += count_mod_n[x_mod] * count_mod_m[y_mod]
 
print(result)