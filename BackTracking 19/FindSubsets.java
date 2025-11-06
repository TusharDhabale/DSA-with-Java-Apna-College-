public class FindSubsets {

    public static void findSubsets1(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;

        }

        // recusrsion
        // yes choice
        findSubsets1(str, ans + str.charAt(i), i + 1);
        // No choice
        findSubsets1(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets1(str, "", 0);
    }

}
