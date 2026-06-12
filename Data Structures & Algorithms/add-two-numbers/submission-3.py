# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        # 3 -> 2 -> 9
        # 5 -> 4 -> 3 -> 9 -> 1
        # 8 -> 6 -> 2 -> 1 + 9 -> 1

        # 1 -> 2 -> 3
        # 4 -> 5 -> 6

        curr1 = l1
        curr2 = l2
        res = ListNode()
        curr3 = res
        temp = 0
        while curr1 or curr2:
            value = 0
            sum_ = 0
            if curr1 and curr2:
                sum_ = curr1.val + curr2.val
                curr1 = curr1.next
                curr2 = curr2.next
                
            elif curr1 and not curr2:
                sum_ = curr1.val
                curr1 = curr1.next
            
            elif curr2 and not curr1:
                sum_ = curr2.val
                curr2 = curr2.next
            
            sum_ += temp
            if sum_ >= 10:
                value = sum_ % 10
                temp = sum_ // 10
            else:
                value = sum_
                temp = 0
                
            curr3.val = value

            if curr1 or curr2 or temp > 0:
                node = ListNode()
                curr3.next = node
                curr3 = curr3.next
        
        if temp > 0:
            curr3.val = temp

        return res
                    
                
                    

        
        