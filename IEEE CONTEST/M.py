import sys
input = sys.stdin.read
 
data = input().split()
n = int(data[0])
arr = list(map(int, data[1:n+1]))
 
arr_sorted = sorted(arr)
 
m = [0] * n
m_sorted = [0] * n
 
m[0] = arr[0]
m_sorted[0] = arr_sorted[0]
 
for i in range(1, n):
    m[i] = m[i - 1] + arr[i]
    m_sorted[i] = m_sorted[i - 1] + arr_sorted[i]
 
q = int(data[n + 1])
index = n + 2
 
results = []
for _ in range(q):
    t = int(data[index])
    l = int(data[index + 1]) - 1
    r = int(data[index + 2]) - 1
    index += 3
    
    if t == 1:
        sum_value = m[r] - m[l] + arr[l]
    else:
        sum_value = m_sorted[r] - m_sorted[l] + arr_sorted[l]
    
    results.append(str(sum_value))
 
print("\n".join(results))