// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int[] fill(int[] nums,int k,int n){
        int[] newNums=new int[n];
        if(k<0||n<0){
            return newNums;
        }
        int temp=0;
            for(int i=0;i<n;i++){
                if(temp<k){
                    newNums[i]=nums[temp];
                    temp++;
                }else if(temp==k){
                    temp=0;
                    newNums[i]=nums[temp];
                    temp++;
                }
            }
        System.out.print(newNums);    
        return newNums;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        System.out.println(fill(nums,3,10));
    }
}