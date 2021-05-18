package entities;

public class Student {

    public String name;
    public double firstGrades;
    public double secondGrades;
    public double thirdGrades;

    public double sumGrades() {
        double finalGrades;
        return finalGrades =  firstGrades + secondGrades + thirdGrades;
    }

    public void finalResult () {
        if(sumGrades() >= 60.00) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.00 - sumGrades());
        }
    }

    public String toString(){
        return "FINAL GRADE = " +
                String.format("%.2f", sumGrades());
    }

}
