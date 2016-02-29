package sorts;

import java.util.Arrays;

/**
   Сортировки:
   1) Бульбашкой
   2)Выборкой
   3)Вставками Делим массив, берем очередней эл-т и вставляем в предыдущее отсортированное множество
   4) Сортировка Шелла
   5) Подсчета
   есть массив и мы делаем временную таблицу table (временный массив) и считаем кол-во повторений каждого эл-та
   мы должны определить max значение
   6) Хоара(Быстрая сортировка) QuickSort
   7) Слияния MargeSort
 */
public class SortExamples {
    public static void main(String... args) {
        int[] arr = {3, 12, 23, 1, 2, 4, 4, 5, 10, 15};
        System.out.println(Arrays.toString(arr) + " ->");
        bubbleSort(arr);
        selectSort(arr);
        insertSort(arr);
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