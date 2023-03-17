// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(20));
    }
}