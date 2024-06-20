 
n = int(input())
coins = list(map(int, input().split()))
 
coins.sort(reverse=True)
 
total_sum = sum(coins)
 
sum_taken = 0
count_coins_taken = 0
 
for coin in coins:
    sum_taken += coin
    count_coins_taken += 1
    if sum_taken > total_sum / 2:
        break
 
print(count_coins_taken)