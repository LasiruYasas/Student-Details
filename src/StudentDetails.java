import java.util.*;

public class StudentDetails {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name : ");
        String name = input.next();

        System.out.print("Enter Student Address : ");
        String address = input.next();

        System.out.print("Enter Number Of Subjects : ");
        int sub = input.nextInt();

        int max = 0;
        int total = 0;
        double average = 0;



        for(int i=1; i<=sub; i++){
            System.out.print("Enter Subject "+i+" Mark : ");
            int subMark = input.nextInt();

            total = total+subMark;

            if(max<subMark){
                max=subMark;
            }
        }
        average = (double)total/(double)sub;

        int j=1;
        while (j>0){
            System.out.println(" ");

            System.out.println("A. Show Student Details ");
            System.out.println("B. Show Maximum Marks ");
            System.out.println("C. Show Average And Result ");
            System.out.println("X. Exit ");
            System.out.println(" ");
            System.out.print("Please Select One Option : ");
            String any = input.next();


            System.out.println(" ");

            switch(any){
                case "A":
                    System.out.println("Student Name : "+name);
                    System.out.println("Student Address : "+address);
                    break;

                case "B":
                    System.out.println("Maximum Mark : "+max);
                    break;

                case "C":
                    System.out.println("Average : "+average);

                    if(average>=50){
                        System.out.println("Result : Pass");
                    }else{
                        System.out.println("Result : Fail");
                    }
                    break;

                default:
                    System.out.println("Please Select Valid Option");
                    break;

                case "X":
                    return;
            }

        }


    }


}
