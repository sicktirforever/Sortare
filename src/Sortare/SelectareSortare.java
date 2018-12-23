package Sortare;

public class SelectareSortare {
    public static void main(String[] args) {
        int [] array = {4,8,3,7,1,2,9,12};
       int[] array2 = Sortare(array);
       for (int numere : array2)
        System.out.print(numere+ " ");
    }

    public static int[] Sortare (int[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;

            for (int j = i+1 ; j < n; j++) {
                if (array[ j ] < array[ min ]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[ min ] = array[ i ];
            array[ i ] = temp;

        }
        return array;
    }
}
