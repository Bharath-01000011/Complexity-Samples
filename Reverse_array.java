public class Reverse_array {

    static void reverse_print(int[] arr)
    {
        for(int i=0; i < arr.length/2 ; i++)
        {
            int last_index = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[last_index];
            arr[last_index] = temp;
        }

        System.out.println("Reversed array : ");
        for(int i : arr)
        {
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse_print(arr);
    }
}
