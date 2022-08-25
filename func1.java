public class func1 {

    void func(int[] arr)
    {
        int sum=0, prod=1;
        for(int i : arr)
        {
            sum += i;
            prod *= i;
        }
        System.out.println("Sum of array : "+sum+"\nProduct of array : "+prod);
    }
    public static void main(String[] args) {
        func1 obj = new func1();
        int arr[] = {1,2,3,4,5};
        obj.func(arr);
    }
    
}
