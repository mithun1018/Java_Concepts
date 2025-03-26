package Phase_1;
import  java.util.*;
public class Calculator {
    public static void start(){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no.of.subject: ");
        int no_of_sub=Integer.parseInt(scan.next());
        int[] sub_Array=new int[no_of_sub];
        int total=0;
        String[] sub_name=new String[no_of_sub];
        for(int i=0;i<no_of_sub;i++){
            System.out.println("Enter the subject Name: ");
            sub_name[i]=scan.next();
            System.out.println("Enter the "+sub_name[i]+" Mark: ");
            sub_Array[i]=Integer.parseInt(scan.next());
            total+=sub_Array[i];
        }
        calculate_Marks(total,no_of_sub);

    }
    public static void calculate_Marks(int total,int no_of_sub){
        double percentage=total/no_of_sub;
        String grade="";
        if(percentage>90){
            grade="A";
        } else if (percentage<90 && percentage>70) {
            grade="B";
        } else if (percentage<70 && percentage>50) {
            grade="C";
        } else if (percentage<50 && percentage>30) {
            grade="D";
        }else {
            grade="FAIL";
        }
        System.out.println("TOTAL: "+total+"\nPercentage: "+percentage+"\nGrade: "+grade);
    }
}
