class TimeMap:

    def __init__(self):
        self.__map = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        array = self.__map.get(key, [])
        # do not need to handle the timestamp order problems 
        # becuase the timestamp of the set function is strictly increasing
        array.append((timestamp, value))
        self.__map[key] = array


    def get(self, key: str, timestamp: int) -> str:
        
        if key not in self.__map:
            return "";
        
        array = self.__map.get(key)
        arrayLength = len(array)
        if arrayLength == 0 or timestamp < array[0][0]:
            return ""
        # 10 20 30 
        # 10
        l, r = 0, arrayLength - 1
        prevTimestampIndex = 0
        while l <= r:
            index = (l + r) // 2
            mid = array[index]
            currentTimestamp = mid[0]

            if currentTimestamp == timestamp:
                return mid[1]
            elif currentTimestamp < timestamp:
                prevTimestampIndex = index
                l = index + 1
            else:
                r = index - 1
        
        if timestamp < array[0][0]:
            return array[arrayLength - 1][1]
        else:
            return array[prevTimestampIndex][1]


        

        

        
