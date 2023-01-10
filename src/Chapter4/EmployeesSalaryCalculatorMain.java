package Chapter4;

//import java.util.Scanner;

public class EmployeesSalaryCalculatorMain {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

        EmployeesSalaryCalculator employee1 = new EmployeesSalaryCalculator();
        employee1.grossPay();
        double pay = employee1.getGrossPay();
        double overtimePay = employee1.getTimeAndHalfPay();
        System.out.println("employee1 your gross pay is: "+pay);
        System.out.println("employee1 your time and a half pay is: "+overtimePay);
        System.out.println();


        EmployeesSalaryCalculator employee2 = new EmployeesSalaryCalculator();
        employee2.grossPay();
        double payment = employee2.getGrossPay();
        double timeAndHalf = employee2.getTimeAndHalfPay();
        System.out.println("employee2 your gross pay is: "+payment);
        System.out.println("employee2 your time and a half pay is: "+timeAndHalf);
        System.out.println();

        EmployeesSalaryCalculator employee3 = new EmployeesSalaryCalculator();
        employee3.grossPay();
        double payedAmount = employee3.getGrossPay();
        double overtime = employee3.getTimeAndHalfPay();
        System.out.println("employee3 your gross pay is: "+payedAmount);
        System.out.print("employee3 your time and a half pay is: "+overtime);
    }
}
