

// GOAL: Understanding Multilevel Inheritance, Abstraction

// 1. Create an abstract class called HeadOffice.
// 2. Have below normal methods in it.
//   2.1. public void check_accounts(int amount)
//     - Have a print statement inside here
//   2.2. public int pay_tax(int amount)
//     - return this.amount from here
// 3. Have an abstract method as below.
//   3.1. public abstract void receive_Customers()
// 4. Create another abstract class called Branch_Plan as sub class of HeadOffice
// 5. Have main method in it.
// 6. Add a print statement inside main method.  
// 8. Add below method
//   - public void do_interview()
//     - Have a print statement inside here.
// 7. Create another class 'Branch' as sub class of Branch_Plan
// 8. Handle abstract methods here with print statements.
// 9. Create an instance called 'branch' for Branch class.
// 10. Confirm the below methods can be called.
//   - public void check_accounts(1000)
//   - public int pay_tax(2000)
//     - Check if value is returned.
//   - public void do_interview()

package bank.Chennai;
 abstract class HeadOffice{

public void check_accounts(int amount){
    System.out.println("2)The amount is "+ amount);
}
public int pay_tax(int amount){
    System.out.println("3)The tax Amount is "+ amount);
    return amount;
}
abstract void receive_Customers();
}

__________________________________________
package bank.Chennai;
abstract class Branch_Plan extends HeadOffice {


    public static void main(String[] args){
       System.out.println("1)I am from Branch plan of main method");
    }
    public void do_interview(){
        System.out.println("5)I am from do_interview in Branch_plan");
    }

}
________________________________________
package bank.Chennai;
class Branch extends Branch_Plan{
 public static void main(String[] args){
     Branch branch = new Branch();
     branch.check_accounts(1000);
     branch.pay_tax(2000);
     branch.receive_Customers();
     branch.do_interview();
 }
   void receive_Customers(){
     System.out.println("4)I am Abstract method defined by branch class " );
   }
} 