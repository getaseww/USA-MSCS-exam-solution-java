public class diffOfSumsOfEvensAndOdds {

    public static int diff(int[] nums) {
        // declare variables
        
        int sumOffOdds = 0;
        int sumOffEvens = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                sumOffEvens += nums[i];
            }
            else{
                sumOffOdds += nums[i];
            }
        }

        // return the difference of the sums of odd numbers in the array and even numbers in the array
        return sumOffOdds - sumOffEvens;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(diff(nums));
    }
}
