package ArrayPracticeProblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfArray {

    public static void main(String[] args)
    {
        int[] arr = {1,2,1,5,4,1,2,3,4,3,4,6,7};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count = map.get(arr[i]) + 1;
                map.put(arr[i], count);
            }
            else
            {
                map.put(arr[i], 1);
            }

        }

        System.out.println(map);


    }
}
