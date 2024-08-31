package ArrayPracticeProblem;

public class EvenPositionElement {

    public static void main(String[] args)
    {
        int[] arr = {2, 5, 8, 3, 7, 4};

        for (int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(arr[i] + " ");
            }

        }

    }
}
