package leetcode.reverseinteger;

import java.util.HashMap;



class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

//class Solution {
//    public int reverse(int x) {
//        String number = String.valueOf(x);
//        char[] digits = number.toCharArray();
//        String reversed = new String();
//
//        for(int i= digits.length-1; i >= 0; i-- ){
//            reversed = reversed + digits[i];
//        }
//        int result = Integer.parseInt(reversed);
//
//        return result;
//    }
//}
