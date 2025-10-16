public class binarysearch {
    
    public static int binarysearc(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start<= end) {
            int mid = (start + end) / 2;

            //comparisions
            if(numbers[mid] == key) { //right
                return mid;
            }else { // left
                end = mid-1;}
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 25;

        System.out.println("Index for key is : "+ binarysearc(numbers, key));
    } 
}
