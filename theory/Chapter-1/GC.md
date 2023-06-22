<h2>Garbage Collector</h2>

```java
 public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a"); // one points to object "a" 
        two = new String("b"); // two points to object "b"
        one = two; // one points to object "b", object "a" is GC
        String three = one; // three points to object "b"
        one = null;
    } 
    // object "b" is GC because out of scope
}
```