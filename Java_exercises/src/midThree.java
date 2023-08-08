public class midThree {
    public static int[] mid(int[] nums) {
        int[] myArray = new int[3];

        myArray[0] = nums[nums.length/2 - 1];
        myArray[1] = nums[nums.length/2];
        myArray[2] = nums[nums.length/2 + 1];
        return myArray;
    }
}
