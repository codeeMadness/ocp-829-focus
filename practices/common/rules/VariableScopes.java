package common.rules;

public class VariableScopes {

    //Local variables: In scope from declaration to the end of the block
     public void eatIfHungry(boolean hungry) {
         if (hungry) {
             int bitesOfCheese = 1;
         } // bitesOfCheese goes out of scope here
//         System.out.println(bitesOfCheese); // DOES NOT COMPILE

         {boolean drink = true;}
//         System.out.println(drink); // DOES NOT COMPILE
     }

     //Method parameters: In scope for the duration of the method
     
     //Instance variables: In scope from declaration until the object is eligible for garbage collection
     //Class variables: In scope from declaration until the program ends
     public class Mouse {
         final static int MAX_LENGTH = 5; //Class variables
         int length; //Instance variables
         public void grow(int inches) {
             if (length < MAX_LENGTH) {
                 int newSize = length + inches;
                 length = newSize;
             }
         }
     }
}
