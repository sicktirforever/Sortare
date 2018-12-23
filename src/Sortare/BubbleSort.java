package Sortare;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,3,14,2,15,9,7,5};
        int[] array2 = Sortare(array);
        for (int numere: array2)
            System.out.print(numere + " , ");
    }
    


    public static int[] Sortare(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n; j++) {
                if (array[ j - 1 ] > array[ j ]) {
                    temp = array[ j ];
                    array[ j ] = array[ j - 1 ];
                    array[ j - 1 ] = temp;
                }
            }
        }
        return array;
    }
}
