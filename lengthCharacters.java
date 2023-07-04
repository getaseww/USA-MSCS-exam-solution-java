import java.util.Arrays;

public class lengthCharacters {

    public static int[] lengthChars(int[] nums, int start, int length) {
        if (start >= nums.length || start < 0)
            return null;
        int endIndex = start + length - 1;
        if(endIndex>=nums.length){
            return null;
        }

        int[] newArray = new int[length];
        for(int i=start;i<=endIndex;i++){
            newArray[i-start]=nums[i];
        }

        return newArray;
    }

    public static void main(String args[]) {
            int[] nums={2,3,4,5,6,1,2,3};

            System.out.println(Arrays.toString(lengthChars(nums, 3, 4)));
    }
}
