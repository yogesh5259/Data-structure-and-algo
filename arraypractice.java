class arraypractice {
    public static void main(String[] args) {
       // Array is a collection of similar type of data
       // One variable can stote multiple items 
       // We can access each element by it's index
       // element can be any valid type like Int, Float, Double, String Or any reference type.
        int[] age  = new int[10]; // Array with name "age" can store 10 items from index 0 to 9.
        age[0] = 10; // We can add element through it's index in constant time.
        System.out.println(age[0]); // We can get element with index in constant time.
        // Also we have multitimension array
        int[][] matrix = new int[3][3]; // This is 3x3 matrix
        String[] array = new String[10]; // Reference type element array type is String
        arraypractice[] array1 = new arraypractice[10]; // reference type element but array is class type
    }
}