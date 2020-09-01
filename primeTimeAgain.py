D,P = map(int,input().split())
prime = [True]*(D+1)
prime[0] = False
prime[1] = False
i = 2
while i <= D:
    if prime[i] is True:
        for j in range(2*i,D+1,i):
            prime[j] = False
    i += 1
        
X = int(D/P)
C = 0
for i in range(1,X+1):
    Y = i
    L = []
    while Y <= D:
        if prime[Y] is True:
            L.append(Y)
        else:
            break
        Y += X
    if len(L) == P:
        C += 1
print(C,end="")
