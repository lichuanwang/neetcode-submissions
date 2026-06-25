class Solution:
    def myPow(self, x: float, n: int) -> float:
        res = 0
        if n == 0:
            return 1
        if n == 1:
            return x
        
        val = 1
        for i in range(abs(n)):
            val *= x
       
        if n > 1:
            return val
        elif n < 0:
            return 1 / val

        