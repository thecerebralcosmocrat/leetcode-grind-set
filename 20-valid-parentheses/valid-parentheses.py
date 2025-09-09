class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch in "({[":
                stack.append(ch)
            else:
                if not stack:
                    return False
                last = stack.pop()  # pop once
                if (ch == ')' and last != '(') or \
                   (ch == '}' and last != '{') or \
                   (ch == ']' and last != '['):
                    return False
        return not stack
