class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        # add open parenthesis only if open_count < n (recursion condition)
        # add closing parenthesis only if closed_count < open_count (recursion condition)
        # valid parenthesis IFF open_count == closed_count == n (base condition)

        stack = []
        result = []

        def backtrack(open_count, closed_count):

            if open_count == closed_count == n:
                result.append("".join(stack))
                return

            if open_count < n:
                stack.append("(")
                backtrack(open_count + 1, closed_count)
                stack.pop()

            if closed_count < open_count:
                stack.append(")")
                backtrack(open_count, closed_count +1)
                stack.pop()

        backtrack(0, 0)
        
        return result