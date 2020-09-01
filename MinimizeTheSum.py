from heapq import heappush as push, heappop as pop
from math import floor

heap = []
N,K = map(int,input().split())
L = list(map(int,input().split()))
for i in range(N):
    push(heap,-1*L[i])

for i in range(K):
    X = -1*pop(heap)
    X = floor(X/2)
    push(heap,-1*X)

C = 0
for i in heap:
    C += (-1*i)
print(C,end="")
