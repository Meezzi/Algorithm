a = int(input())
cunt = 0
while(True):
    if cunt == 0:
        start = a
    else:
        start = c
    cunt = cunt+1
    x,y = 0,0
    if start < 10:
        x=0
        y=start
    else: 
        x=start//10
        y=start%10
    b = x+y
    if b >= 10:
        b= b%10
    c = y*10 + b
    if a==c:
        break
print(cunt)    


