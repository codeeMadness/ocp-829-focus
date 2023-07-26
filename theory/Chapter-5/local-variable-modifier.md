```java
public void zooAnimalCheckup(boolean isWeekend) {
    final int rest;
    //final must be assigned a value before it can be used.
    if(isWeekend) rest = 5; else rest = 20;
    System.out.print(rest);
    final var giraffe = new Animal();
    final int[] friends = new int[5];
    rest = 10;              // DOES NOT COMPILE
    giraffe = new Animal(); // DOES NOT COMPILE
    friends = null;         // DOES NOT COMPILE
}

public void zooAnimalCheckup(boolean isWeekend) {
    final int rest;
    //The rest variable might not have been assigned a value
    if(isWeekend) rest = 5;
    System.out.print(rest); // DOES NOT COMPILE
}

// final attribute only refers to the variable reference; 
// the contents can be freely modified 
public void zooAnimalCheckup() {
    final int rest = 5;
    final Animal giraffe = new Animal();
    final int[] friends = new int[5];
    giraffe.setName("George");
    friends[2] = 2;
}
```