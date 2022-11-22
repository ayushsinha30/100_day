class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
 ListNode result = new ListNode();
        ListNode p = result;
        int carry = 0;
        ListNode zero = new ListNode(0);
        while(l1 != zero || l2!=zero || carry==1) {
          int sum = l1.val + l2.val + carry;
          if(sum>=10) {
              result.val = sum - 10;
              carry = 1;
          } else {
              result.val = sum;
              carry = 0;
          }
          if(l1.next != null)
            l1 = l1.next;
          else {
            l1 = zero;
            System.out.println("l1 zero");
          }
          if(l2.next != null)
            l2 = l2.next;
          else {
            l2 = zero;
            System.out.println("l2 zero");
          }
          System.out.println("l1.val="+l1.val+",l2.val="+l2.val);
          if(l1!=zero || l2!=zero || carry==1) {
            ListNode newNode = new ListNode();
            result.next = newNode;
            result = result.next;
          }
        }
        
        return p;
        
    }
}
