public class MergeSort {
    public static void main(String[] args) {
        int[] list = { 8, 3, 6, 2, 7, 1, 9, 4, 10, 5 };
        printArray(list);
        mergeSort(list, 0, list.length - 1);
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(",");
            System.out.print(array[i]);
        }
        System.out.println("}");
    }

    public static void mergeSort(int[] a, int first, int last) {
        if (last - first == 0) // (sublist has only one value)
        {
            // do nothing
        } else if (last - first == 1) // (sublist has two values)
        {
            // sort it if necessary
            if (a[first] > a[last]) {
                int temp = a[first];
                a[first] = a[last];
                a[last] = temp;
            }
        } else // recursion, divide list into two halves
        {
            /* Find midpoint of current sublist */
            int mid = (first + last) / 2;
            /* Call mergeSort and process left sublist */
            System.out.println("left: Sorting " + first + " through " + mid);
            mergeSort(a, first, mid);
            /* Call mergeSort and process right sublist */
            System.out.println("right: Sorting " + (mid + 1) + " through " + last);
            mergeSort(a, mid + 1, last);
            /* merge left and right sublists */
            System.out.println("merging");
            merge(a, first, mid, last);
        }
        printArray(a);
    }

    private static void merge(int[] a, int first, int mid, int last) {
        int[] temp = new int[last - first + 1];
        int i = first;
        int j = mid + 1;
        System.out.println("first: " + first + ", mid: " + mid + ", last: " + last);
        for (int k = first; k <= last; k++) {
            // check if a sublist is done:
            if (i > mid || j > last)// a sublist is done
            {
                System.out.println("i: " + i + ", j: " + j);
                if (i > mid && j <= last)// left sublist is done
                {
                    System.out.println("a[j]: " + a[j]);
                    temp[k - first] = a[j];
                    j++;
                } else if (i <= mid && j > last)// right sublist is done
                {
                    System.out.println("a[i]: " + a[i]);
                    temp[k - first] = a[i];
                    i++;
                } else {
                    break;
                }
            } else {
                if (a[i] < a[j]) {
                    temp[k - first] = a[i];
                    i++;
                } else {
                    temp[k - first] = a[j];
                    j++;
                }
            }
        }
        printArray(temp);
        for (int count = 0; count < temp.length; count++) {
            a[first + count] = temp[count];
        }
    }
}