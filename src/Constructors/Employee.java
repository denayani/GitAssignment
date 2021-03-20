
/**
 * @author DeAlwN
 * @version Assignment 2 - Section 1
 * <p>This class prints the details of each employees in the company</p>
 */

package Constructors;

public class Employee {

    //Declare constructor

    Employee(String pname,int pDOJ,char pgender,String paddress,double psalary){
        name = pname;
        DOJ = pDOJ;
        gender = pgender;
        address = paddress;
        salary = psalary;
    }

    // Declare variables
    String name;
    int DOJ;
    char gender;
    String address;
   double salary;

    //Print Employee details
    public void printEmployeeDetails(){
      System.out.printf("%20s %20d %20c %20s %20f\n", name, DOJ,gender,address, salary);
    }
}
