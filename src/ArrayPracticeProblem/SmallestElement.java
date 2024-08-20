package ArrayPracticeProblem;

public class SmallestElement {

    public static void main(String[] args)
    {
        int[] arr = {20, 10, 5, 30, 4, 30, 3};

        int small = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < small)
            {
                small = arr[i];
            }

        }

        System.out.println(small);

    }
}
