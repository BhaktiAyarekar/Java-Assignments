public class Binary_Search {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            
            if(arr[mid] == target)
            {
                return mid;
            }
            else if (target < arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
               
        return -1;
    }
     
        public static void main(String[] args) 
    {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};

        int index = binarySearch(arr, 16);

        System.out.println("Index: " + index);  
    }
}