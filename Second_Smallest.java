public class Second_Smallest {
    
    public static int secondSmallest(int[] arr)
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr)
        {
            if (num < smallest)
            {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num!= smallest)
            {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        System.out.println("Second Smallest : " + secondSmallest(arr));
    }
}
