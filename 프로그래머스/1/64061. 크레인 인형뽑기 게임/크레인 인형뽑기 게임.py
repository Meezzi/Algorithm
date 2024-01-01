def solution(board, moves):
    answer = 0
    stk = []
    
    for i in moves :
        for j in range(len(board)) :
            if board[j][i-1] != 0 :
                stk.append(board[j][i-1])
                board[j][i-1] = 0
            
                if len(stk) >= 2 :
                    if stk[-1] == stk[-2] :
                        stk.pop()
                        stk.pop()
                        answer += 2
                break
            
    return answer