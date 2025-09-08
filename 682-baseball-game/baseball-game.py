class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = [] # basically a list
        sum_of_scores = 0
        
        for i in range (len(operations)):
            if(operations[i]=="C"):
                stack.pop()
            elif(operations[i]=="D"):
                top = stack[-1]
                stack.append(top*2)
            elif(operations[i]=="+"):
                top = stack[-1]
                secondLast = stack[-2]
                stack.append(top + secondLast)
            else:
                stack.append(int(operations[i]))
        
        for s in stack:
            sum_of_scores += s
        
        return sum_of_scores