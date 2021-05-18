package application;

import entities.Student2;

import java.util.Scanner;

public class ArrayObjetos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student2[] student = new Student2[10];

        System.out.print("How many rooms will be rented? ");
        int qntRent = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<qntRent; i++) {
            System.out.println("\nRent #" + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            student[room] = new Student2(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i < student.length; i++){
            if(student[i] != null) {
                System.out.println(i + ": " + student[i].getName() + ", " + student[i].getEmail());
            }
        }

        sc.close();

    }
}
