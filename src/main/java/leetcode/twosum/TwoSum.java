package leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

//Your input
// [2,7,11,15]
// 9
// Output
// [0,1]
// Expected
// [0,1]
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);

            if (map.containsKey(target - numbers[i])) {
                result[0] = numbers[i];
                result[1] = map.get(target - numbers[i]);
            }
        }
        return result;
    }
}




//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//
//            if (map.containsKey(target - numbers[i])) {
//                result[1] = i;
//                result[0] = map.get(target - numbers[i]);
//                return result;
//            }
//
//            map.put(numbers[i], i);
//        }
//        return result;
    }
}
