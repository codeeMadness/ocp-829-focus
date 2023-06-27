If no such <b>default</b> option is available, the entire switch
statement will be skipped.

```java
switch(animal) {
    case 1: case 2: System.out.print("Lion");
    case 3: System.out.print("Tiger");
}

switch(animal) { //since java 14
    case 1,2: System.out.print("Lion");
    case 3: System.out.print("Tiger");
}

public void printDayOfWeek(int day) { //since java 14
    // switch expression
    var result = switch(day) {
        case 0 -> "Sunday";
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        default -> "Invalid value";
    };
    System.out.print(result);

}

public void printSeason(int month) {
    switch(month) {
        case 1, 2, 3 -> System.out.print("Winter");
        case 4, 5, 6 -> System.out.print("Spring");
        case 7, 8, 9 -> System.out.print("Summer");
        case 10, 11, 12 -> System.out.print("Fall");
    } 
}

public void printSeason(int month) {
    switch(month) {
        case 1, 2, 3: System.out.print("Winter");
        case 4, 5, 6: System.out.print("Spring");
        default: System.out.print("Unknown");
        case 7, 8, 9: System.out.print("Summer");
        case 10, 11, 12: System.out.print("Fall");
    } //WinterSpringUnknownSummerFall

    // without break, it prints everything!
}


```

The following is a list of all data types supported by switch statements:

- int and Integer
- byte and Byte
- short and Short
- char and Character
- String
- enum values
- var (if the type resolves to one of the preceding types)

Excluded:

- boolean and Boolean
- long and Long
- float and Float

```java
// The values in each case statement must be compile-time constant values of the same data type as the switch value.
final int getCookies() { return 4; }
void feedAnimals() {
    final int bananas = 1;
    int apples = 2;
    int numberOfAnimals = 3;
    final int cookies = getCookies();
    switch(numberOfAnimals) {
        case bananas:
        case apples: // DOES NOT COMPILE
        case getCookies(): // DOES NOT COMPILE
        case cookies : // DOES NOT COMPILE
        case 3 * 5 :
    } 
}
```

<h2>Returning</h2>

```java
int measurement = 10;
int size = switch(measurement) {
    case 5 -> 1;
    case 10 -> (short)2;
    default -> 5;
    case 20 -> "3"; // DOES NOT COMPILE
    case 40 -> 4L; // DOES NOT COMPILE
    case 50 -> null; // DOES NOT COMPILE
};


int fish = 5;
int length = 12;
var name = switch(fish) {
    case 1 -> "Goldfish";
    case 2 -> {yield "Trout";}
    case 3 -> {
        if(length > 10) yield "Blobfish";
        else yield "Green";
    }
    default -> "Swordfish";
};

int fish = 5;
int length = 12;
var name = switch(fish) {
    case 1 -> "Goldfish";
    case 2 -> {} // DOES NOT COMPILE
    case 3 -> {
        if(length > 10) yield "Blobfish";
    } // DOES NOT COMPILE
    default -> "Swordfish";
};
```

```java
// a switch expression that returns a value must handle all possible input values.
// There’s no case branch to cover 5 (or 4, -1, 0, etc.)
String type = switch(canis) { // DOES NOT COMPILE
    case 1 -> "dog";
    case 2 -> "wolf";
    case 3 -> "coyote";
};
```
As a developer, there are two ways to address this:
- Add a default branch. (<b>preferred</b>)
- If the switch expression takes an enum value, add a case branch for every possible enum value.
