// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {

    public static int minDistance(int n){
        List<Integer> factors=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }

        if(factors.size()>=2){
        return factors[factors.size()-1]-factors[factors.size()-2];
        }else if(factors.size()==1){
            return factors[0];
        }else{
            return 0;
        }

    }
    public static void main(String[] args) {
        System.out.println(minDistance(10));
    }
}