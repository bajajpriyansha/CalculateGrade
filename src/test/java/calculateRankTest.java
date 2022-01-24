import org.junit.Assert;
import org.junit.Test;

public class calculateRankTest {
    @Test
    public void calcRankOfStudent()
    {
        calculateRank calc=new calculateRank();
        Integer arr[]={90,67,54,37,78};
        int f=calc.calcRank(arr,45);
        Assert.assertEquals(-1,f);
    }
    @Test
    public void calcRankOfStudent1()
    {
        calculateRank calc=new calculateRank();
        Integer arr[]={90,78,54,87,60};
        int f=calc.calcRank(arr,60);
        Assert.assertEquals(4,f);
    }
    @Test
    public void calcRankOfStudent2()
    {
        calculateRank calc=new calculateRank();
        Integer arr[]={90,67,54,37,78};
        int f=calc.calcRank(arr,45);
        Assert.assertEquals(-1,f);
    }
    @Test
    public void calcRankOfStudent3()
    {
        calculateRank calc=new calculateRank();
        Integer arr[]={78,65,43,27,43};
        int f=calc.calcRank(arr,43);
        Assert.assertEquals(3,f);
    }
    @Test
    public void calcRankOfStudent4()
    {
        calculateRank calc=new calculateRank();
        Integer arr[]={90,98,76,23,15,16};
        int f=calc.calcRank(arr,16);
        Assert.assertEquals(5,f);
    }
}
