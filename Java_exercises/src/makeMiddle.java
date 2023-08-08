public class makeMiddle {
    public static int[] make(int[] nums) {
        int[] myArray = new int[2];
        myArray[0] = nums[nums.length/2 -1];
        myArray[1] = nums[nums.length/2];
        return myArray;
    }
}
