import java.util.Arrays;

public class ThreeSumSorting {
    

    public static boolean threeSum(int[] array, int length, int sum){
        
        int left = 0;
        int right = length - 1;

        //Sort the array
        Arrays.sort(array);


        //Fix first element 
        for (int i = 0; i < length; i++) {
            
            left = i + 1;
            while(left < right){
                if(array[i] + array[left] + array[right] == sum){
                    System.out.println(array[i] + " " + array[left] + " " + array[right]);
                    return true;
                }
                else if(array[i] + array[left] + array[right] < sum){
                    left++;
                } else if(array[i] + array[left] + array[right] > sum){
                    right--;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int array[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int length = array.length;
        threeSum(array, length, sum);
    }
}
