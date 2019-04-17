import java.util.Scanner;
/**
 *
 * @author aaron
 */
public class GradeSysMain {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String [] courses = {"BIT-1201", "BIT-1202", "BIT-1203", "BIT-1204", "BIT-1205", "BIT-1206", "BIT-1207", "CSC-1208"};
        int num = courses.length;
        double [] marks = new double[num];
        double [] gpa = new double[num];
        char [] grade = new char[num];
        
        double sum=0, avg;
        
        for(int i=0;i<num;i++) {
            
            System.out.println("Enter your "+courses[i]+" marks: ");
            
            double test =scan.nextDouble();
            
            if(test>=0 && test<=100){
                marks[i]=test;
                sum+=marks[i];
                double mygpa = Math.round((marks[i]/100)*5*100)/100.0;
                gpa[i]=mygpa;
//                System.out.println(mygpa);
            }else {
                System.out.println("Please enter a number between 0 and 100 \n");
                i--;
            }
        }
        for (int i=0;i<num;i++){
            if(gpa[i]>=4.4){
                grade[i]='A';
            }else if(gpa[i]>=3.6) {
                grade[i]='B';
            }else if(gpa[i]>=2.8) {
                grade[i]='C';
            }else if(gpa[i]>=2.0) {
                grade[i]='D';
            }else {
                grade[i]='F';
            }
        }
        double cgpa=Math.round(sum/(num*100)*5*100)/100.0;
        avg=sum/num;
        System.out.println();
        System.out.println("Courses"+"\t\t"+"GPA"+"\t\t"+"Grade");
        
        for(int i=0;i<num;i++) {
            System.out.println(courses[i]+"\t"+gpa[i]+"\t\t"+grade[i]);
        }
        System.out.println();
        System.out.println("Total: "+sum+"/"+num*100);
        System.out.println("Average: "+avg);
        System.out.println("You've got a CGPA of "+cgpa);
    }
}
