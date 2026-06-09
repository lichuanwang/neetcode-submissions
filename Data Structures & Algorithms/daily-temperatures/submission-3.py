class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        result = [0] * len(temperatures)

        for i in range(len(temperatures)):
            temp = temperatures[i]
            while len(stack) > 0 and temp > stack[-1][0]:
                current = stack.pop()
                result[current[1]] = i - current[1]

            stack.append((temp, i))
        
        return result

            










                    


        