package algossssss;

import java.util.Arrays;

public class GreedyAlgs {
    public static long maxNumberFromDigits(int[] nums) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            result.append(nums[i]);
        }

        return Long.parseLong(result.toString());

        // Используем сортировку пузырьком

//        int[] temp = nums.clone();
//        boolean swapped;
//
//        for (int i = 0; i < temp.length - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < temp.length - i - 1; j++) {
//                if (temp[j] < temp[j + 1]) {
//                    int swap = temp[j];
//                    temp[j] = temp[j + 1];
//                    temp[j + 1] = swap;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        for (int num : temp) {
//            result.append(num);
//        }
//
//        return Long.parseLong(result.toString());

//                  Используем Stream API
//        String result = Arrays.stream(nums)
//                .boxed()
//                .sorted(Comparator.reverseOrder())
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//
//        return Integer.parseInt(result);
//    }
    }
}
