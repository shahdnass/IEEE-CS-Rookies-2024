x = int(input())
arr_a = []
arr_b = []
 
for i in range(x):
    a, b = map(int, input().split())
    arr_a.append(a)
    arr_b.append(b)
if arr_a != arr_b:
    print("rated")
else:
    for i in range(1, x):
        if arr_a[i] > arr_a[i - 1]:
            print("unrated")
            break
    else:
        print("maybe")