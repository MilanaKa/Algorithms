package alg2.Algorithms2.alg2.alg2controller;

public class Main {
    public boolean isPerfectNum(int n){
        int sum=0;
        for(int i =1; i<n; i++){
            if (n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            return true;
        }
        return false;
    }
}
