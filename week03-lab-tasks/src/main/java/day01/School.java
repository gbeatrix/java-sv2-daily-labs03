package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(150);
        students.addHeight(150);
        students.addHeight(153);
        students.addHeight(155);
        System.out.println(students.isHeightsIncreasing());
        students.addHeight(147);
        System.out.println(students.isHeightsIncreasing());
    }
}
