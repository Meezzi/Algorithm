def solution(routes):
    answer = 1
    routes.sort(key = lambda x : (x[1], x[0]))
    end = routes[0][1]
    
    for i in range(len(routes)-1) : 
        if end < routes[i+1][0] :
            answer += 1
            end = routes[i+1][1]
            
    return answer