public class Unrodered_pair {

    static void unordered_printing(int[] arr)
    {
        for(int i = 0; i < arr.length ;i++)
        {
            for(int j = i+1; j < arr.length; j++ )
            {
                System.out.print(arr[i]*10+arr[j]+"   ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        unordered_printing(arr);
    }   
}
