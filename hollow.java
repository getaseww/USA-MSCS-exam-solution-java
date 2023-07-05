
class Main {

    public static boolean isHollow(int[] nums) {
        if(nums.length<3) return true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&nums.length>3){
                
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums={10,20};
        System.out.println(isHollow(nums));
    }
}
