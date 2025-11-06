public class primeinrange {
    
    public static void primerange(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)){ //true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeinrange(20); //2 to 20
    }
}
