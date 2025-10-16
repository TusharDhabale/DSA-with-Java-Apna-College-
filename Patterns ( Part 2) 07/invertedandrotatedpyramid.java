public class invertedandrotatedpyramid {

    public static void inverted_Rotataed_Half_pyramid(int n){
        //Outer 
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_Rotataed_Half_pyramid(10);
    }
}