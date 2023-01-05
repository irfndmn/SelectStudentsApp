package studentSelect;

import java.util.Scanner;

public class Student {
    /*
       TASK:
       An application to be selected for the sports course...

             requirements
       ==============================
                Male
                ======
                height: 1.75 and over
                weight: 70-80 kg

               Female
               ======
               Height : 1.55 and over
               Weight : 55-70 kg
     =================================


     Take the number of students,  name of each students, gender, weight and height with the user...
     Than give the result of students that selected for course....

 */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Num Of Students ");
        int numOfStudents = sc.nextInt();


        String[] name = new String[numOfStudents];
        String[] gender = new String[numOfStudents];
        double[] height = new double[numOfStudents];
        double[] weight = new double[numOfStudents];
        boolean isControl = true;
        do {
            isControl = true;

            for (int i = 0; i < numOfStudents; i++) {
                System.out.println();
                System.out.println("         ==================================        ");
                System.out.println();

                System.out.print("Please Enter Student's Name : ");
                String nam = sc.next().toLowerCase().replaceAll("[^a-z ]", "").replaceAll("\s+", " ");
                name[i] = nam.substring(0, 1).toUpperCase() + nam.substring(1);
                System.out.print("Please Enter Student's Gender (For Man use M,For Female Use F,)  :  ");
                String gen = sc.next().toUpperCase().substring(0, 1);
                if ((gen.equals("F") || gen.equals("M"))) {
                    gender[i] = gen;
                } else {
                    isControl = false;
                    break;
                }
                System.out.print("Please Enter Height of Students  : ");
                height[i] = sc.nextDouble();
                System.out.print("Please Enter Weight Of Students : ");
                weight[i] = sc.nextDouble();
            }
        } while (!isControl);


        int count = 0;
        for (int i = 0; i < numOfStudents; i++) {

            boolean isSelected = gender[i].equals("M") &&
                    height[i] >= 1.75 &&
                    (weight[i] >= 70 && weight[i] <= 80) ||
                    gender[i].equals("F") &&
                            height[i] >= 1.55 &&
                            (weight[i] >= 55 && weight[i] <= 70);


            if (isSelected) {
                count++;
                System.out.println();
                System.out.println();
                System.out.println("===========Selected Students For Sport Course========");
                System.out.println();

                System.out.println("Name : " + name[i] + " Gender : " + gender[i] + " Height : " + height[i] + " Weight : " + weight[i]);

            }
        }

        if (count < 1) {
            System.out.println();
            System.out.println("    =====  ======  ======  ====  ====    ");
            System.out.println("  There Is No Any Student To Selected For Course   ");
        }


    }


}
