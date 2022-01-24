import org.junit.Assert;
import org.junit.Test;

public class calcAverageTest {
    @Test
    public void findAverage1()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={10,20,30,40};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(25.0,f,0.1);
    }
    @Test
    public void findAverage2()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={20,30,40,50};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(35.0,f,0.1);
    }
    @Test
    public void findAverage3()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={95,86,73,42};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(74.0,f,0.1);
    }
    @Test
    public void findAverage4()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={11,9,55,60,87,90,99,89};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(62.5,f,0.1);
    }
    @Test
    public void findAverage5()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={65,78,63,25,69,7,98};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(57.8,f,0.1);
    }
    @Test
    public void findAverage6()
    {
        CalculateAverageMarks calc=new CalculateAverageMarks();
        int arr[]={10,20,30,40};
        double f=calc.CalcAverage(arr);
        Assert.assertEquals(25.0,f,0.1);
    }
}
