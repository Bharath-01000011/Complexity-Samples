public class Pair_printing {

    static void pair_function(int[] arr)
    {
        for(int i : arr)
        {
            for(int j : arr)
            {
                System.out.print((i*10)+j+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        pair_function(arr);

    }
}
