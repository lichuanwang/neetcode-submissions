class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        tracker = []
        for i in range(len(temperatures)):
            temp = temperatures[i]
            while tracker and temp > tracker[-1][1]:
                cur = tracker.pop()
                res[cur[0]] = i - cur[0]

            tracker.append((i, temperatures[i]))
        return res 

        