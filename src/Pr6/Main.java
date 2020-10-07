package Pr6;

class Main
{
    static void reverse(Student[] array)
    {
        for (int i = 0; i < array.length / 2; i++) {
            Student temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++) {

            var value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static void QuickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        var opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i].getPoints() < opora.getPoints()) {
                i++;
            }

            while (array[j].getPoints() > opora.getPoints()) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }



    public static void main(String[] args)
    {
        var students = Student.getSamples();

        for (var t : students) System.out.println(t);

        System.out.println();
        insertionSort(students);

        for (var t : students) System.out.println(t);

        System.out.println();
        QuickSort(students,0,9);

        for (var t : students) System.out.println(t);
    }
}

