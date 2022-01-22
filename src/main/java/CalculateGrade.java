public class CalculateGrade {
    public String calcGrade(int marks)
    {
        if(marks>=90)
            return "A+";
        else if(marks>=80&&marks<90)
            return "A";
        else if(marks>=70&&marks<80)
            return "B+";
        else if(marks>=60&&marks<70)
            return "B";
        else if(marks>=55&&marks<60)
            return "C+";
        else if(marks>=50&&marks<55)
            return "C";
        else
            return "Fail";
    }
}
