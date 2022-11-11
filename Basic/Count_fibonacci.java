import java.util.ArrayList;

public class Count_fibonacci {
    public static void main(String[] args) {
        int low = 20, high = 100;
        System.out.println("Fibonacci Numbers b/w " + low+ " and " + high +" : "+ countFibs(low, high));
    }

    private static ArrayList<Integer> countFibs(int low, int high) {
        int f1 = 0, f2 = 1, f3 = f1+f2;
 
        // Count fibonacci numbers in given range
        // int result = 0;
        ArrayList<Integer> nums = new ArrayList<>();
  
        while (f1 <= high) {
            if (f1 >= low){
                nums.add(f1);
                // result++;
            }                
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return nums;
    }
}