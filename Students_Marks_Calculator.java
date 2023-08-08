import java.util.Scanner;

public class Students_Marks_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give the Student Name: ");
        String name = sc.nextLine();
        System.out.print("Physics Marks: ");
        int m1 = sc.nextInt();
        System.out.print("Chemistry Marks: ");
        int m2 = sc.nextInt();
        System.out.print("Maths Marks: ");
        int m3 = sc.nextInt();
        System.out.print("English Marks: ");
        int m4 = sc.nextInt();
        System.out.print("Computer Marks: ");
        int m5 = sc.nextInt();
        int sum = m1 + m2 + m3 + m4 + m5;
        int av = (m1 + m2 + m3 + m4 + m5) / 5;
        System.out.println("Total marks is : " + sum);
        if (av < 100) {
            System.out.println("The Average Marks out of 100 is : " + av);
            System.out.println("The Percentage of " + name + " is " + av + " % .");
            int per = av;
            if (per >= 90) {
                System.out.println("" + name + " got A Grade.");
            } else {
                if (per >= 80 && per < 90) {
                    System.out.println("" + name + " got B Grade.");
                }
                if (per >= 70 && per < 80) {
                    System.out.println("" + name + " got C Grade.");
                }
                if (per >= 60 && per < 70) {
                    System.out.println("" + name + " got D Grade.");
                }
                if (per >= 50 && per < 60) {
                    System.out.println("" + name + " got E Grade.");
                }
                if (per < 50) {
                    System.out.println("" + name + " got F Grade.");
                }

            }
            if (per >= 50) {
                System.out.println("" + name + " Passed the Exam. :)");
            } else {
                System.out.println("" + name + " Failed the Exam. :()");
            }
        } else {
            System.out.println("INVALID!!!!!! Kindly Fill the Marks Out Of 100 ONLY!!!!!");
        }
        sc.close();
    }

}
