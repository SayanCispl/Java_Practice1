public class Array_3 {
    public static void main(String[] args)
    {
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={1,2,3,4};
        System.out.println(arr1[0]);
        System.out.println(arr2[2]);
        System.out.println(arr2.length);
        int[] arr3 = arr1;
        arr3[0]= 22;
        System.out.println(arr3[0]);
        System.out.println(arr1[0]);



    }
}
