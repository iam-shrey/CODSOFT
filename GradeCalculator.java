import java.util.*;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects You Have in Total: ");
        int n = sc.nextInt();
        float marks=0;
        System.out.println("Enter the Marks Obtained(out of 100) in Each Subjects One by One: ");
        for(int i=0;i<n;i++){
            marks+=sc.nextFloat();
        }
        float avg = marks/n;
        System.out.println("Total Marks Obtained = "+marks+"/"+n*100);
        System.out.printf("Average Percentage = %.2f",avg);System.out.println(" %");
        if(avg>=90)
            System.out.println("Grade Obtained = A+"+"\nRemark: Pass");
        else if(avg>=80 && avg<90)
            System.out.println("Grade Obtained = A"+"\nRemark: Pass");
        else if(avg>=70 && avg<80)
            System.out.println("Grade Obtained = B+"+"\nRemark: Pass");
        else if(avg>=60 && avg<70)
            System.out.println("Grade Obtained = B"+"\nRemark: Pass");
        else if(avg>=50 && avg<60)
            System.out.println("Grade Obtained = C+"+"\nRemark: Pass");
        else if(avg>=40 && avg<50)
            System.out.println("Grade Obtained = C"+"\nRemark: Pass");
        else if(avg>=33 && avg<40)
            System.out.println("Grade Obtained = D"+"\nRemark: Pass");
        else{
            System.out.println("Grade Obtained = E"+"\nRemark: Fail");
        }
        sc.close();
    }
}
