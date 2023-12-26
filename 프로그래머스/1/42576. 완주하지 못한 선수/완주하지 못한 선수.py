def solution(participant, completion):
    part = {}
    for i in participant :
        if i in part :
            part[i] += 1
        else :
            part[i] = 1
    
    for i in completion :
        if part[i] == 1 :
            del part[i]
        else:
            part[i] -= 1
    answer = list(part)
    return answer[0]