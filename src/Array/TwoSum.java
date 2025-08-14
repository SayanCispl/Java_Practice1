package src.Array;

public class TwoSum {

    public static void main(String [] args){
        int [] arr = new int[4];
        arr[0]= 22;
        arr[1] = 100;
        arr[2] = 111;
        arr[3] = 9;

        twoSum(arr, 211);
    }

    public static void twoSum(int[] nums, int target) {
        for (int i=0 ; i < nums.length ; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (target == nums[i]+nums[j]){
                    System.out.println("Indices: [" + i + ", " + j + "]");
                }else {
                    continue;
                }
            }
        }
    }

    
}
