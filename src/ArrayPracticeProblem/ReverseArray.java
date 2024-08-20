package ArrayPracticeProblem;

public class ReverseArray {

    public static void main(String[] args)
    {
        int[] arr = {51,31,52,84,10,64};

        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }

        System.out.println();

        System.out.println("Array in Reverse Order:");

        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");

        }

    }
}
