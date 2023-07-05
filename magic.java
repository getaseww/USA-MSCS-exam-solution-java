public class magic {
    

    static int isMagic(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[0]==0)return 1;
            boolean isPrime=true;
            for(int j=2;j<nums[i];j++){
                if(nums[i]%j==0) isPrime=false;
            }

            if(isPrime) sum+=nums[i];
        }

        if(sum==nums[0]) return 1;
        else return 0;
    }

    public static void main(String args[]){
        int[] nums={3};
        System.out.println(isMagic(nums));
    }
}
