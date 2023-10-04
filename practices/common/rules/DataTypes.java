package common.rules;

public class DataTypes {

    public void demoPrimitiveTypes() {
//        long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789l;

//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
        double reallyUgly = 1__________2; // Also compiles

        int million1 = 1000000; //ugly
        int million2 = 1_000_000; //best

    }

    public void demoReferenceTypes() {
        String greeting = new String("How are you?");

//        int value = null; // DOES NOT COMPILE
        String name = null;
        String name1 = greeting;

    }

    public static void main(String[] args) {

    }
}
