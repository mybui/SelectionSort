
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int trial = array[0];
        for (int i: array) {
            if (i < trial) {
                trial = i;
            }
        }
        return trial;
    }
    
    public static int indexOfSmallest(int[] array){
        int trial = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[trial]) {
                trial = i;
            }
        }
        return trial;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int trial = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[trial]) {
                trial = i;
            }
        }
        return trial;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        int val2 = array[index2];
        array[index1] = val2;
        array[index2] = val1;
    }
    
    public static void sort(int[] array) {
        System.out.println("Initial:");
        System.out.println(array);
        System.out.println("Sorting:");
        
        for (int i = 0; i < array.length; i++) {
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}
