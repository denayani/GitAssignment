package Assignment2;

/**
 * @author Nayani
 * @version Assignment 2 - section 2
 * <p>This program prints overall exam marks of students</p>
 */

import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {

        //get input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        String name = sc.next();

        System.out.print("Please Enter Gender(F/M): ");
        String f = sc.next();
        char gender = f.charAt(0);

        System.out.print("Please Enter Marks for Subject 1: ");
        int subject1 = sc.nextInt();

        System.out.print("Please Enter Marks for Subject 2: ");
        int subject2 = sc.nextInt();

        System.out.print("Please Enter Marks for Subject 3: ");
        int subject3 = sc.nextInt();

        System.out.print("Please Enter Marks for Subject 4: ");
        int subject4 = sc.nextInt();

        System.out.print("Please Enter Marks for Subject 5: ");
        int subject5 = sc.nextInt();

        //get the total of all the subjects
        int sum = subject1 + subject2+ subject3 + subject4 + subject5;
        int average = sum / 5;

        if ((subject1 >= 60) && (subject2 >= 60) && (subject3 >= 60) && (subject4 >= 60) && (subject5 >= 60)){
            if ((average >= 80)) {
                if (gender == 'M') {
                    System.out.println("Hi " + name + ", Congratulations ! \t " + " He Passed the exam with distinction");
                } else if (gender == 'F')
                    System.out.println("Hi " + name + ", Congratulations ! \t " + " She Passed the exam with distinction");
            } else if ((average < 80) && (average >= 60)) {
                if (gender == 'M') {
                    System.out.println("Hi " + name + ", Congratulations ! \t " + " He Passed the exam with First Class");
                } else if (gender == 'F')
                    System.out.println("Hi " + name + ", Congratulations ! \t " + " She Passed the exam with First Class");
            }
        }else if ((subject1 >= 35) && (subject2 >= 35) && (subject3 >= 35) && (subject4 >= 35) && (subject5 >= 35) && (average <= 60)){
            if (gender == 'M')
                System.out.println("Hi " + name + ", Congratulations ! \t " + " He Passed the exam with Second Class");
            else if (gender == 'F')
                System.out.println("Hi " + name + ", Congratulations ! \t " + " She Passed the exam with Second Class");

        }else
            System.out.println("Sorry!" + name + ", Failed the exam");

    }
}











