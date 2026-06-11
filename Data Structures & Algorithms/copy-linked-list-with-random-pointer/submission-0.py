"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        data = {None : None}
        current = head
        while current:
            copy = Node(current.val)
            data[current] = copy
            current = current.next
        
        current = head
        while current:
            copy = data[current]
            copy.next = data[current.next]
            copy.random = data[current.random]
            current = current.next
        
        return data[head]

        
