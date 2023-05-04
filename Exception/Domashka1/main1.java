package Exception.Domashka1;

public class main1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 5, 2, null, 5, 7, 5,};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == null) {
                throw new RuntimeException("В массиве найден NULL");
            }
            
        }
            System.out.print("В массиве NULL не найден");
    }
}
