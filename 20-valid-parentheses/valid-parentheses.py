class Solution(object):
    def isValid(self, s):
        Stack = []
        for ch in s:
            if ch == '('or ch == '{'or ch =='[':
                Stack.append(ch)
            elif ch == ')'or ch =='}'or ch ==']':
                if len(Stack)==0:
                    return False
                top = Stack.pop()
                if ch == ')'and top != '(':
                    return False
                if ch == '}'and top != '{':
                    return False
                if ch == ']'and top != '[':
                    return False
            # else:
            #     return true
        return len(Stack) == 0
        
