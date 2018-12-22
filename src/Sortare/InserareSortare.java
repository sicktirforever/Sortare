package Sortare;

public class InserareSortare {

    public static void main(String a[]){
        int[] array = {10,34,2,56,7,67,88,42};
        int[] array2 = Sortare(array);
        for(int numere:array2){
            System.out.print(numere + ", ");

        }
    }

    public static int[] Sortare(int[] array){

        int temp;
        for (int i = 1; i < array.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}
