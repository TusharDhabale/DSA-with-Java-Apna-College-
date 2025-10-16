public class PrintBinStrings {

    public static void printbinString(int n, int lastPlaces, String str) {

        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //Work
        // if(lastPlaces == 0){
            //sit 0 on chair n
        //     printbinString(n-1, 0, str.append("0"));
        //     printbinString(n-1, 1, str.append("1"));
        // } else {
        //     printbinString(n-1, 0, str.append("0"));
        // }

        printbinString(n-1, 0, str+"0");
        if (lastPlaces == 0) {
            printbinString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
    printbinString(3, 1, "");
    }
}
