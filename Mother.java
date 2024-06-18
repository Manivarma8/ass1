// Task-8

// Goal: Learning Inheritance, super keyword and Method Overriding
// Grandma:
// 1. Create a class called 'Grandma'.
// 2. Declare Field as below in it.
//   1. String name = "Stella";
// 3. Have below methods in it.
//   1. public void work()
// 4. Have print statements as you wish in the above methods' definition.

// Mother:
// 1. Create a class called 'Mother' as Child class of Grandma.
// 2. Declare Field as below in it.
//   1. String name = "Arasi";
// 3. Have below method in it.
//   1. public void work()
// 4. Have print statement to print 'name' and super.name in work() definition.  
// 5. Add 'super.work();' inside work() method.

// Kid:
// 1. Create a class called 'Kid' as Sub class of Mother.
// 2. Declare Field as below in it.
//   1. String name = "Suman";
// 3. Define main method as 'public static void main(String[] args)
// 4. Inside main method, create an instance called 'kid' for Kid class.
// 5. Have below methods in it.
//   1. public void work()
//   2. public void study()
// 6. Have print statements as you wish in the above two methods' definition.
// 7. Call study() method from main method.
// 8. Inside study() method, call work() method.
// 9. Print name and super.name inside work() method

package bank.Chennai;

public class Grandma {
String name = "Stella";
public void work(){
    System.out.println("2) I am Stella Who is mother of Arasi Grandma of Suman");
}
}

_______________________________________________________________________________________
package bank.Chennai;
public class Mother extends Grandma {
    String name = "Arasi";
    public void work(){
        System.out.println("1) Iam " + name + " My mother's name is "+ super.name);
        super.work();
    }
}
______________________________________________________________________________________
package bank.Chennai;
public class Kid extends Mother{
    String name = "Suman";

    public static void main(String[] args){
        Kid kid = new Kid();
    kid.study();
    kid.work();
    }
    public void work(){
        System.out.println("4) I am suman working in kid class");
    }
    public void study(){
        super.work();
        System.out.println("3) working in kid class I am " +name +" My mother's name is "+ super.name);
    }
}