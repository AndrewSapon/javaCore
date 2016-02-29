package sorts;


import java.util.Arrays;

public class MergeSort
{
    public static void main (String [] args)
    {
        int [][] data = {
                {9, 7, 0, 3, 5, 2, 6, 1, 4, 8},
                {0, 3, 5, 2, 1, 4},
                {0, 3, 5, 2, 1},
                {0, 3, 5, 2},
                {0, 3, 5},
                {0, 3},
                {0},
                {},
        };
        for (int [] origin : data)
        {
            System.out.println("origin" + Arrays.toString(origin));
            // отсортировать начиная с 0 - arr.length эллементов
            int[] sorted = sort(origin, 0, origin.length);
            System.out.println("sorted :" + Arrays.toString(sorted));
            System.out.println();
        }
    }
    // метод sort получает массив, с какого эл-тф сортировать и сколько
    public static int [] sort( int [] array, int from, int len)
    {
        // в массиве указываю подмассив, если его длинна 0
        // вернуть массив нулевого размера
        if (len == 0)
        {
            return new int[0];
            // если массив длинны 1 - вернуть массив длинны 1
        } else if (len == 1)
        {
            return new int[] {array[from]};
            // если 2 - то сравниваю первый эллемент со вторым
        } else if (len == 2)
        {
            if (array [from] < array [from + 1]){
                return new int[]{array[from], array[from + 1]};

                // если они в не правильном порядке, меняю их местами
            }else
            {
                return new int  [] {array[from + 1], array[from]};
            }
        }
        // иначе, если массив больше 2, я делю массив на 2 половины
        // сортирую две половины и сравниваю
        else{
            int [] left = sort(array, from, len/2);
            int []  right = sort(array, from + (len /2), len - (len/2));
            return merge(left, right);
        }

    }
    private static int[] merge(int[] arr_1, int[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
            System.out.print(Arrays.toString(arr_1) + " + " + Arrays.toString(arr_2));
            System.out.println("->" + Arrays.toString(result));
        }
        return result;
    }
}


