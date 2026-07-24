class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        if len(points) == 1:
            return points
        dist = []
        for point in points:
            dist.append([math.sqrt((point[0] - 0)**2 + (point[1] - 0)**2), point])
        
        heapq.heapify(dist)
        res = []
        for i in range(k):
            res.append(heapq.heappop(dist)[1])
        
        return res
        




        