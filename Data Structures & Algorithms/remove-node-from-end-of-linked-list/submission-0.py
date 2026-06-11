# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # 1 2 3 4 
        length = 0
        current = head
        while current:
            length += 1
            current = current.next
        
        prevIndex = length - n - 1
        if prevIndex < 0:
            if head.next:
                head = head.next
                return head
            return None

        prev = head
        for i in range(prevIndex):
            prev = prev.next

        temp = prev.next.next
        prev.next = temp 

        return head 



        