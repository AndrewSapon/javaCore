package sorts;

import java.util.Arrays;

public class SortsTime {
    public static void main(String[] args) {
        int[] arr1 = new int[500];
        long timeBegin;
        long t2;
        long scoreTime;
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = (int) (Math.random() * 100);

        System.out.println(Arrays.toString(arr1));


        timeBegin = System.nanoTime();
        bubbleSort(arr1);
        scoreTime = System.nanoTime() - timeBegin;

        System.out.print("bubbleSort(arr1)= ");
        if (scoreTime < 10000000)
            System.out.print("0");
        System.out.println(scoreTime);

        timeBegin = System.nanoTime();
        selectSort(arr1);
        scoreTime = System.nanoTime() - timeBegin;

        System.out.print("selectSort(arr1)= ");
        if (scoreTime < 10000000)
            System.out.print("0");
        System.out.println(scoreTime);

        timeBegin = System.nanoTime();
        insertSort(arr1);
        scoreTime = System.nanoTime() - timeBegin;

        System.out.print("insertSort(arr1)= ");
        if (scoreTime < 10000000)
            System.out.print("0");
        System.out.println(scoreTime);
    }

    // сортировка Бульбашкой
    public static void bubbleSort(int[] arr) {
        // проверка инициализирован ли массив
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        // Cокращаем длинну массива на 1 (цикл бежит в обратном порядке <-----)
        for (int barier = arr.length - 1; barier >= 0; barier--)
            // Меняем местами эл-ты ----->
            for (int index = 0; index < barier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = tmp;
                }
            }
        System.out.println(Arrays.toString(arr));
    }

    // Сортировка выборкой
    public static void selectSort(int[] arr) {

        int min = 0;
        // проверка инициализирован ли массив
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        // бежим по массиву
        for (int i = 0; i < arr.length; i++) {
            // сокращем массиыв на 1, в самом начале выходит мин эл
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < min)
                    min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Сортировка вставками
    public static void insertSort(int[] arr) {
        int tmp;
        // проверка инициализирован ли массив
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        // бежим по массиву
        for (int i = 0; i < arr.length; i++) {
            int currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > currElem) {
                arr[prevKey + 1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
