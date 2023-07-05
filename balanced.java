// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int isBalanced(int[] nums){
        for(int i=0;i<nums.length;i++){
            if((i%2==0&&nums[i]%2!=0)||(i%2!=0&&nums[i]%2==0)){
                return 0;
            };
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] nums={6,6,2,3,12};
        System.out.println(isBalanced(nums));
    }
}