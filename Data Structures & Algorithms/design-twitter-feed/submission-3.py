class Twitter:

    def __init__(self):
        self.count = 0
        self.user_tweets = defaultdict(list)
        self.user_followees = defaultdict(set)
        

    def postTweet(self, userId: int, tweetId: int) -> None:
        self.user_tweets[userId].append((self.count, tweetId))
        self.count -= 1
        

    def getNewsFeed(self, userId: int) -> List[int]:
        userTweets = self.user_tweets[userId].copy()
        userFollowees = self.user_followees[userId]
        for f in userFollowees:
            if self.user_tweets[f]:
                userTweets.extend(self.user_tweets[f].copy())
        heapq.heapify(userTweets)
        res = []
        i = 0
        while userTweets and (i < 10):
            res.append(heapq.heappop(userTweets)[1])
            i += 1
        return res

    def follow(self, followerId: int, followeeId: int) -> None:
        if followerId != followeeId:
            self.user_followees[followerId].add(followeeId)

    def unfollow(self, followerId: int, followeeId: int) -> None:
        if self.user_followees[followerId]:
            self.user_followees[followerId].discard(followeeId)
        
