class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        ans = []
        lvl = 0
        for c in s:
            if(c == '('):
                if(lvl>0):
                    ans.append(c)
                lvl+=1
            else:
                lvl-=1
                if(lvl>0):
                    ans.append(c)
        return ''.join(ans)