public class countDigits {
    
    static int countDigit(int x,int y){
        if(x<0||y<0) return -1;
        int count=0;
        while(x!=0){
            if(x%10==y) count++;
            x=x/10;
        }

        return count;
    }

    public static void main(String args[]){
        System.out.println(countDigit(33333, -1));
    }
}
