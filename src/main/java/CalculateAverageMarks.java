public class CalculateAverageMarks {
    public double CalcAverage(int arr[])
    {   int  sum=0;
        double average;
        for(int val:arr) {
          sum+=val;}
          average=(double)sum/ (double)arr.length;
        return average;
    }
}
