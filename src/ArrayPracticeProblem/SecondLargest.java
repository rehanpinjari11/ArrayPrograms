package ArrayPracticeProblem;

public class SecondLargest {

    public static void main(String[] args)
    {
        int[] arr = {25,48,65,32,10,84};

        int total = arr.length;
        int temp;

        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (arr[i] > arr[j])
                {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

                }

            }

        }

        System.out.println(arr[total - 2]);

    }

}
