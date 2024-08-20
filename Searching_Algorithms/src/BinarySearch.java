public class BinarySearch{

    // mid = start + (end - start) / 2 --> ((start + end) / 2)
    
    // iterative binary search
    public static void BinarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length -1;
       while(start <= end){
        int mid = (start + end) / 2;
        if(arr[mid]> x){
            end = mid - 1;
        }else if(arr[mid] < x){
            start = mid + 1;
        }else if (arr[mid] == x){
            System.out.println("Element found at index " + mid);
            return;
        }else{
            System.out.println("Element not found");
        }

       } 
    }

    // recursive binary search
    public static void BinarySearch(int[] arr, int x, int start, int end) {
        if (start > end) {
            System.out.println("Element not found");
        } else {
            int mid = (start + end) / 2;
            if (arr[mid] > x) {
                BinarySearch(arr, x, start, mid - 1);
            } else if (arr[mid] < x) {
                BinarySearch(arr, x, mid + 1, end);
            } else if (arr[mid] == x) {
                System.out.println("Element found at index " + mid);
                return;
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 6;
        BinarySearch(arr, x);
        BinarySearch(arr, x, 0, arr.length - 1);
        
    }
}