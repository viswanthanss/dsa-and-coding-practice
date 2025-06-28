n = int(input())                      # Read size of the list
a = list(map(int, input().split()))  # Read list elements

for i in range(n):
    if a[i] not in a[:i] and a.count(a[i]) > 1:
        print(a[i], end=' ')
