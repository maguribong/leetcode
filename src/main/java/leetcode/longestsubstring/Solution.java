package leetcode.longestsubstring;

import java.util.HashMap;
import java.util.Map;

/** window sliding
 *
 * there is a two pointer. start and end
 * when sub sum is equal to Target, answer += 1
 * when sum is more than Target or end ==length, start++
 * else end++
 *
 * http://blog.naver.com/PostView.nhn?blogId=kks227&logNo=220795165570
 *
 * Your input
 * "abcabcbb"
 * Output
 * 3
 * Expected
 * 3
 * */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer =0;
        Map<Character, Integer> map = new HashMap<>();

        for(int start = 0, end = 0; end < s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);

            }
            map.put(s.charAt(end), end + 1);
            answer = Math.max(answer, end-start + 1);
        }

        return answer;
    }
}
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int result = 0;
//
//        for (int start = 0, end = 0;
//        end<nums.length; end++){
//            if (map.containsKey(target)) {
//                return map.get(target);
//            }
//            if (nums[end] > target) {
//                start++;
//            }
//
//            map.put(nums[end], end);
//        }
//        return nums[start];
//    }
//}

//
//
//
//
//
//        int answer =0;
//        Map<Character, Integer> map = new HashMap<>();
//
//        for(int start = 0, end = 0; end < s.length(); end++){
//            if(map.containsKey(s.charAt(end))){
//                start = Math.max(map.get(s.charAt(end)),start);
//
//            }
//            map.put(s.charAt(end), end + 1);
//            answer = Math.max(answer, end-start + 1);
//        }
//
//        return answer;
//    }
//}
//public class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>(); // current index of character
//        // try to extend the range [i, j]
//        for (int j = 0, i = 0; j < n; j++) {
//            if (map.containsKey(s.charAt(j))) {
//                i = Math.max(map.get(s.charAt(j)), i);
//            }
//            ans = Math.max(ans, j - i + 1);
//            map.put(s.charAt(j), j + 1);
//        }
//        return ans;
//    }
//}