// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static int[] fill(int[] nums,int k,int n){
        int[] arr2 = new int[n];        
        System.out.println("from fill class");
        System.out.println(arr2);
        if(k<0||n<0){
            return arr2;
        }
        int temp=0;
            for(int i=0;i<n;i++){
                if(temp<k){
                    arr2[i]=nums[temp];
                    temp++;
                }else if(temp==k){
                    temp=0;
                    arr2[i]=nums[temp];
                    temp++;
                }
            }
            System.out.println(Arrays);
        return arr2;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        System.out.println(fill(nums,3,10));
    }
}