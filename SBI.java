// Task-7

// GOAL: Learning private, default and public Access Modifiers, Creating Package and understanding its usage, Calling Methods with/without arguments.  

// 1. Check if you can create private class
// 2. Check if you can create private main method
// 3. Check if you can create Method local variable as private.  

// Task:
// 1. Create a package called bank.chennai.
// 2. Create a public class called 'SBI'.
// 3. Have default non-static variables String empName, empId.
// 4. Have default static variable branch_name = 'chennai'
// 5. Create two default, non-static methods
// get_loan(int amount), create_account() with void as return datatype.
// 6. Now, in the same package(bank.creditcard), create one more default class called Account_Holder.
// 7. Have main method in this class.
// 8. Try to access all static, non-static variables and non-static methods in SBI class.  
// 9.  Create another package called bank.madurai.
// 10. In this package, create default class called Account_Holder_Madurai.  
// 11. Have main method in this class.
// 12. Try to access all static, non-static variables and non-static methods in SBI class.
// 13. Note down the Errors and rectify those errors and make sure this class gives output without any error.

package bank.Chennai;

public class SBI {

       protected String empName = "Manivarman";
    protected String empid = "FBZ12345F";

    protected static String branch_name = "chennai";
    protected void get_loan(int amount){
            System.out.println("The loan amount is " + amount);
            System.out.println("His city is " + branch_name);


   }

    protected void create_account(){
            System.out.println("Employee id no id = " + empid);
            System.out.println("Get Aadhar card of " + empName);
           System.out.println("His city is " + branch_name);
        }
    }
package bank.Chennai;

public class Account_Holder {

    public static void main(String[] args) {
        SBI Box = new SBI();
         Box.get_loan(1000000);
         Box.create_account();
    }
}
--------------------------------------------------------------------------------------------------------
package bank.Madurai;
import bank.Chennai.SBI;
class Account_Holder_Madurai extends SBI{
public static void main(String[] args){
    Account_Holder_Madurai vijay = new Account_Holder_Madurai();
    vijay.get_loan(30000);
    vijay.create_account();
}
}
___________________________________________________________________________________________________________
// If the protected access modifier is not present in parent SBI class.another package's Access would be blocked so the error throws by
compiler
The Err message is java: cannot find symbol
  symbol:   method get_loan(int)

  location: variable vijay of type bank.Madurai.Account_Holder_Madurai

____________________________________________________________________________________________________________

Solution: The protector access modifier before the variable and method will have the key to access another package from a package.

Import the Package name .

Get the subclass by corresponded Super class .
