
class Main {

    public static boolean hasKSmallFactors(int k,int n) {
        for(int i=1;i<k;i++){
            for(int j=1;j<k;j++){
                if(i*j==n) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(10,20));        
        System.out.println(hasKSmallFactors(7,30));
        System.out.println(hasKSmallFactors(10,22));

    }
}
