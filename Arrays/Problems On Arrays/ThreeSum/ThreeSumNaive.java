
public class ThreeSumNaive {

    public static boolean threeSum(int[] array, int length,int sum){

        //Fix the first element as array[i]
        for (int i = 0; i < length - 2; i++) {
            
            //fix the second element as array[j]
            for (int j = i + 1; j < length - 1; j++) {
                
                //fix the third element as array[k]
                for (int k = j + 1; k < length; k++) {
                    
                    //check for three element sum
                    if(array[i] + array[j] + array[k] == sum){
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        return true;
                    }
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