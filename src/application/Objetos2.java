package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Objetos2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Nome do Aluno: ");
        student.name = sc.nextLine();
        student.firstGrades = sc.nextDouble();
        student.secondGrades = sc.nextDouble();
        student.thirdGrades = sc.nextDouble();

        System.out.println(student);
        student.finalResult();


    }
}
