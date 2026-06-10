# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        s, f = head, head.next
        # using fast and slow pointer to find the ending point of segment 1 
        # and starting point of the segment2
        while f and f.next:
            s = s.next
            f = f.next.next
        
        second = s.next
        s.next = None
        prev = None

        # reverse the second segment of the linkedlist
        while second:
            temp = second.next
            second.next = prev
            prev = second
            second = temp
        
        first, second = head, prev

        while second:
            tmp1, tmp2 = first.next, second.next
            first.next = second
            second.next = tmp1
            first = tmp1 
            second = tmp2

            


        