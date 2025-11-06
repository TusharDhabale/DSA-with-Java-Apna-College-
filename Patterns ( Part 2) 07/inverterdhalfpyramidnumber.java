public class inverterdhalfpyramidnumber {

    public static void inverted_with_Number(int n){
        for(int i=1; i<=n; i++){
            //innetr - numbers
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }     
    }

    public static void main(String[] args) {
         inverted_with_Number(5);
    }

}
