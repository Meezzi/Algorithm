def solution(n, lost, reserve):
    answer = 0
    stu = [1 for _ in range(n + 1) ]
    stu[0] = 2
    
    for i in lost :
        stu[i] = 0
    
    reserve.sort()
    
    for i in reserve :
        if i in lost :
            stu[i] = 1
            continue
        
        if stu[i-1] == 0 :
            stu[i-1] = 1
            continue
        
        if i + 1 <= n :
            if stu[i+1] == 0 :
                stu[i+1] = 1
        
    answer = stu.count(1)
    return answer