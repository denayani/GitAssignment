package Constructors;

public class Company {
    public static void main(String[] args) {

        //Printing the Topics
        System.out.printf("%20s %20s %20s %20s %20s \n","Name","JoiningYear", "Gender", "Address", "Salary");

        //Passing the values to print
        Employee employee1 = new Employee("Robert", 1994, 'M',"abcfdr", 1200.00);
        employee1.printEmployeeDetails();
        Employee employee2 = new Employee("Samanth", 2000, 'F',"fdufuf", 17769.40);
        employee2.printEmployeeDetails();
        Employee employee3 = new Employee("John", 2012, 'M',"26B-", 4500.00);
        employee3.printEmployeeDetails();

    }
}
