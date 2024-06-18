// Task-2

// Assignment 1: return statement

// 1. Create a class called EB_Reading
// 2. Have main method in it.
// 3. Create an object called assessor.
// 4. Using assessor instance, call a method named 'reading'.
// 5. 'reading' method should return consumed units in int.
// 6. Store the returned value as 'consumed_units'.
// 7. Using the same 'assessor' instance, call a method
// named as 'calculate'.
// 8. Pass 'consumed_units' as argument to calculate.
// 9. Based on the consumed_units value, find out How much Customer should pay.
// 10. Print Payment value.

class EB_Reading
{

    public static void main(String[] args) {
        EB_Reading assessment = new EB_Reading(); 
        assessment.reading(100);       
    } 
   int reading(int consumed_units){
    int units = 15;
    int value = consumed_units * units;
   System.out.println("The cost of your electrical consumption is "+ value);
    return value; 
    }
}