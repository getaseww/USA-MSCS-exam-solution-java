
class Main {

    public static int isCenterd(int[] nums) {
        if(nums.length<1||nums.length%2==0){
            return 0;
        }
        int center=(int)Math.ceil(nums.length/2);
        for(int i=0;i<nums.length;i++){
            if(i==center)continue;
            if(nums[i]<=nums[center])return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] nums={5,5,5,5};
        System.out.println(isCenterd(nums));
    }
}
