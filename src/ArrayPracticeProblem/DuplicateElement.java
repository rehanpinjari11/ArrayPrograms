package ArrayPracticeProblem;

public class DuplicateElement {

    public static void main(String[] args)
    {
        int[] arr = {21,50,21,62,14,50,47};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.print(arr[i] + ",");
                }
            }

        }

    }
}
