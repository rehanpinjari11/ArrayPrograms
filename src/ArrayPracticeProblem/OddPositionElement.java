package ArrayPracticeProblem;

public class OddPositionElement {

    public static void main(String[] args)
    {
        int[] arr = {2,8,1,3,4,8,7,6};

        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println(arr[i]+ " ");
            }

        }

    }

}
