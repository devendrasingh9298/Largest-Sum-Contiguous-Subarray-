public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4}; //{1,2,3,-2,5}; //{ -2, -3, 4, -1, -2, 1, 5, -3 };
        
        int size = arr.length;
        int max = Integer.MIN_VALUE, sum = 0;
 
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
            if (max < sum)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        System.out.print("Max : " + max);
    }
}
