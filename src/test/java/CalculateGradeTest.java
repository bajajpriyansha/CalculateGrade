import org.junit.Assert;
import org.junit.Test;

public class CalculateGradeTest {
    @Test
    public void calcGrade1()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(85);
        Assert.assertEquals("A",res);
    }
    @Test
    public void calcGrade2()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(95);
        Assert.assertEquals("A+",res);
    }
    @Test
    public void calcGrade3()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(80);
        Assert.assertEquals("A",res);
    }
    @Test
    public void calcGrade4()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(75);
        Assert.assertEquals("B+",res);
    }
    @Test
    public void calcGrade5()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(60);
        Assert.assertEquals("B",res);
    }
    @Test
    public void calcGrade6()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(45);
        Assert.assertEquals("Fail",res);
    }
    @Test
    public void calcGrade7()
    {
        CalculateGrade  calc1=new CalculateGrade();
        String res=calc1.calcGrade(55);
        Assert.assertEquals("C+",res);
    }

}
