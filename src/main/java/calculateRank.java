import java.util.Arrays;
import java.util.Collections;

public class calculateRank {
    public int calcRank(Integer[] arr,int marks)
    {
        Arrays.sort(arr,Collections.reverseOrder());
        //Collections.reverse(Arrays.asList(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==marks)
                return i+1;
        }
        return -1;
    }
}
