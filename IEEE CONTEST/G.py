n, k = map(int, input().split())
array = []
for _ in range(n):
    array.append(input())
 
z = 0
 
for s in array:
    val = 0
    for j in range(k + 1):
        if str(j) in s:
            val += 1
    if val == k + 1:
        z += 1
 
print(z)