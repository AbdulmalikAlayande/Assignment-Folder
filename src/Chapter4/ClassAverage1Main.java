package Chapter4;

public class ClassAverage1Main {
    public static void main(String[] args) {
        ClassAverage1 student = new ClassAverage1();
        student.sum();
        System.out.println();
        student.getGradeAverage();
        System.out.println("The average of the grades is: "+student.getGradeAverage());
        System.out.println();
    }
}
