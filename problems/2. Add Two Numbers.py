# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
1
class SolutQion:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        d = n =ListNode(0)
        num1 = num2 = ""
        while l1:
            num1 += str(l1.val)
            l1 = l1.next
        while l2:
            num2 += str(l2.val)
            l2 = l2.next
        rst = str(int(num1[::-1]) + int(num2[::-1]))[::-1]
        
        for i in rst:
            d.next = ListNode(i)
            d = d.next
        return n.next

2
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        curr = dummy = ListNode(0)
        num1 , num2 = [], []
        while l1:
            num1.append(l1.val)
            l1 = l1.next
        while l2:
            num2.append(l2.val)
            l2 = l2.next
    
        num1 = int(''.join(map(str, reversed(num1))))
        num2 = int(''.join(map(str, reversed(num2))))

        total = num1 + num2

        for i in str(total)[::-1]:
            curr.next = ListNode(int(i))
            curr = curr.next
        return dummy.next

