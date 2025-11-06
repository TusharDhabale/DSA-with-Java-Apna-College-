public class LastOcurrance {

    public static int lastOcurrance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        
        int IsFound =  lastOcurrance(arr, key, i+1);
        if (IsFound == -1 && arr[i] == key) {
            return i;
            
        }

        return IsFound;
    }
    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOcurrance(arr, 05, 0));
    }
}
