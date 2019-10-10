package leetcode.addtwonumbers;
//        our input
//        [2,4,3]
//        [5,6,4]
//        Output
//        [7,0,8]
//        Expected
//        [7,0,8]

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;
        ListNode current = tempHead;
        int carry = 0;
        while(first != null || second !=null){
            int firstDigit = (first != null) ? first.val : 0;
            int secondDigit = (second != null) ? second.val : 0;
            int sum = firstDigit + secondDigit + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if( first != null){
                first = first.next;
            }

            if( second != null){
                second = second.next;
            }
        }

        if ( carry > 0 ){
            current.next = new ListNode(carry);
        }

        return tempHead.next;
    }
}

