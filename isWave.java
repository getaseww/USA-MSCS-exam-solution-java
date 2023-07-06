/*
 A wave array is defined to an array which does not contain two even numbers or two odd
numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
other.
Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
returns 0.
 */

public class isWave {
    
    static int wave(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2==0&&nums[i+1]%2==0)||(nums[i]%2!=0&&nums[i+1]%2!=0)){
                return 0;
            }
        }

        return 1;
    }
    public static void main(String args[]){
        int[] nums={2,1,4,3,3};
        System.out.println(wave(nums));
    }
}
