```java
public class VisitAttractions {
    public void walk1(int... steps) {}
    public void walk2(int start, int... steps) {}

    //A method can have at most one varargs parameter
    public void walk3(int... steps, int start) {} // DOES NOT COMPILE

    //If a method contains a varargs parameter, it must be the last parameter in the list
    public void walk4(int... start, int... steps) {} // DOES NOT COMPILE
}

// Pass an array
int[] data = new int[] {1, 2, 3};
walk1(data);
// Pass a list of values
walk1(1,2,3);
// Java will create an array of length zero for you.
walk1();
```

```java
public class DogWalker {
    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }
    public static void main(String[] args) {
        walkDog(1); // 0
        walkDog(1, 2); // 1
        walkDog(1, 2, 3); // 2
        walkDog(1, new int[] {4, 5}); // 2
        walkDog(1, null); // Triggers NullPointerException
    } 
}
```