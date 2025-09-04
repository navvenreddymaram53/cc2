import java.util.*;
public class task2c {
public static List<List<Integer>> threeSum(int[] nums) {
List<List<Integer>> result = new ArrayList<>();
Arrays.sort(nums); // Step 1: Sort the array
for (int i = 0; i < nums.length - 2; i++) {
// Skip duplicate elements for i
if (i > 0 && nums[i] == nums[i - 1]) continue;
int left = i + 1;
int right = nums.length - 1;
// Step 2: Use two-pointer technique
while (left < right) {
int sum = nums[i] + nums[left] + nums[right];
if (sum == 0) {
result.add(Arrays.asList(nums[i], nums[left], nums[right]));
// Skip duplicates for left and right
while (left < right && nums[left] == nums[left + 1]) left++;
while (left < right && nums[right] == nums[right - 1]) right--;
left++;
right--;
} else if (sum < 0) {
left++; // Need a bigger sum
} else {
right--; // Need a smaller sum
}
}
}
return result;
}
public static void main(String[] args) {
int[] nums = {-1, 0, 1, 2, -1, -4};
List<List<Integer>> result = threeSum(nums);
System.out.println(result);
}
}
