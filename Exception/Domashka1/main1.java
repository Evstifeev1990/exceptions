package Exception.Domashka1;

public class main1 {
    public static void main(String[] args) {
        // Integer[] arr = {1, 4, 5, 2, null, 5, 7, 5,};
        // checkArray(arr);
        Integer[] arr1 = {1, 4, 5, 2, 5, 7, 5};
        Integer[] arr2 = {1, 4, 5, 2, 5, 7};

        checkArray1(arr1, arr2);
        
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == null) {
                throw new RuntimeException("В массиве найден NULL");
            }
            
        }
            System.out.print("В массиве NULL не найден");
    }
    
    public static void checkArray1 (Integer[] arr1, Integer[] arr2) {
        
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины двух массивов не равны");
        }
        else {
            Integer[] arr3 = new Integer[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] + arr2[i];
                System.out.print(arr3[i] + " ");
            }
        }
    }


}
