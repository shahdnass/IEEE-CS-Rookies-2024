import sys
input = sys.stdin.read
 
while True:
    data = input().split()
    
    if not data:
        break
    
    n = int(data[0])
    road = data[1]
    
    mark = [False] * n
    start = 0
    end = 0
    pos = 0
    direction = 0  
    
    
    for i in range(n):
        if road[i] == '.':
            mark[i] = True
    
    
    while road[start] == '.':
        start += 1
    
    
    if road[start] == 'R':
        direction = 0
    else:
        direction = 1
    
    pos = start
    
    
    while not mark[pos]:
        if direction == 0:  
            while road[pos] != 'L' and not mark[pos]:
                mark[pos] = True
                pos += 1
            while not mark[pos]:
                pos += 1
            pos -= 1
            direction = 1  
        else:  
            while road[pos] != 'R' and not mark[pos]:
                mark[pos] = True
                pos -= 1
            while road[pos] != '.' and not mark[pos]:
                pos -= 1
            pos += 1
            direction = 0  
    
    if direction == 0:
        end = pos - 1
    else:
        end = pos + 1
    
    print(start + 1, end + 1)