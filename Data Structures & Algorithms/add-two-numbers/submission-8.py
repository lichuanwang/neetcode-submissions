# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        curr = l1
        l1Sum = 0
        expo = 0
        while curr:
            l1Sum += curr.val * (10 ** expo)
            curr = curr.next
            expo += 1
        
        l2Sum = 0
        expo = 0
        curr = l2
        while curr:
            l2Sum += curr.val * (10 ** expo)
            curr = curr.next
            expo += 1
        
        totalSum = l1Sum + l2Sum 
        res = ListNode()
        curr = res

        while totalSum > 0:
            curr.val = totalSum % 10
            totalSum = totalSum // 10
            if totalSum > 0:
                newNode = ListNode()
                curr.next = newNode
                curr = curr.next
        
        return res

