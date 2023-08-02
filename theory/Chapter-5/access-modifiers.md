<h3>Private</h3>

- the method can be called only from within the same class.

```java
package pond.duck;
public class FatherDuck {
    private String noise = "quack";
    private void quack() {
        System.out.print(noise); // private access is ok
    }
}

package pond.duck;
public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}
```

<h3>Package Access</h3>

- default access
- You simply omit the access modifier.
- the method can be called only from a class in the same package.

```java
package pond.duck;
public class MotherDuck {
    String noise = "quack";
    void quack() {
        System.out.print(noise); // package access is ok
    }
}

package pond.duck;
public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack(); // package access is ok
        System.out.print(duck.noise); // package access is ok
    }
}

package pond.swan;
import pond.duck.MotherDuck; // import another package
public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack(); // DOES NOT COMPILE
        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}
```

<h3>Protected</h3>

- the method can be called only from a class in the same package or a subclass.

```java
package pond.shore;
public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.print(text); // protected access is ok
    }
}

package pond.shore; // Same package as Bird
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.print(bird.text); // protected access is ok
    }
}

package pond.inland; // Different package than Bird
import pond.shore.Bird;
public class BirdWatcherFromAfar { // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // DOES NOT COMPILE
        System.out.print(bird.text); // DOES NOT COMPILE
    }
}

package pond.goose; // Different package than Bird
import pond.shore.Bird;
public class Gosling extends Bird { // Gosling is a subclass of Bird
    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }
    public static void main(String[] args) {
        new Gosling().swim();
    }
}
```

```java
package pond.swan; // Different package than Bird
import pond.shore.Bird;
public class Swan extends Bird { // Swan is a subclass of Bird
    public void swim() {
        floatInWater(); // protected access is ok
        System.out.print(text); // protected access is ok
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // subclass access to superclass
        System.out.print(other.text); // subclass access to superclass
    }
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.print(other.text); // DOES NOT COMPILE
    }
}

package pond.goose; // Different package than Bird
import pond.shore.Bird;
public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.print(other.text);
    }

    //Although the object happens to be a Goose, it is stored in a Bird reference.
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        other.floatInWater(); // DOES NOT COMPILE
        System.out.print(other.text); // DOES NOT COMPILE
    }
}

package pond.duck; // Different package than Goose
import pond.goose.Goose; 
public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        goose.floatInWater(); // DOES NOT COMPILE
    }
}
```

<h3>Public</h3>

- the method can be called from anywhere.

```java
public class ParkTrip {
    public void skip1() {}

    //no access modifier called default
    default void skip2() {} // DOES NOT COMPILE

    //wrong order
    void public skip3() {} // DOES NOT COMPILE

    void skip4() {}
}
```

- access modifiers and optional specifiers can appear in any order

```java
package pond.duck;
public class DuckTeacher {
    public String name = "helpful";
    public void swim() {
        System.out.print(name); // public access is ok
    }
}

package pond.goose; // Different package
import pond.duck.DuckTeacher;
public class LostDuckling {
    public void swim() {
    var teacher = new DuckTeacher();
    teacher.swim(); // allowed
        System.out.print("Thanks" + teacher.name); // allowed
    }
}
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/3d2fbc19-5ce9-4534-a7ac-7134ecca1a01)

<h2>Static</h2>

- For utility or helper methods that don’t require any object state. 
- For state that is shared by all instances of a class. All instances must share the same state.

```java
public static void main(String[] unused) {
    var p1 = new Penguin();
    p1.name = "Lilly";
    p1.nameOfTallestPenguin = "Lilly";
    var p2 = new Penguin();
    p2.name = "Willy";
    p2.nameOfTallestPenguin = "Willy";
    System.out.println(p1.name); // Lilly
    System.out.println(p1.nameOfTallestPenguin); // Willy
    System.out.println(p2.name); // Willy
    System.out.println(p2.nameOfTallestPenguin); // Willy
}

//trickier
public class Snake {
    public static long hiss = 2;
}
System.out.println(Snake.hiss); //easy one!

// You can use an instance of the object to call a static method. 
// The compiler checks for the type of the reference and uses that instead of the object
Snake s = new Snake();
System.out.println(s.hiss); // s is a Snake
s = null;
System.out.println(s.hiss); // s is still a Snake

Snake.hiss = 4;
Snake snake1 = new Snake();
Snake snake2 = new Snake();
snake1.hiss = 6;
snake2.hiss = 5;
System.out.println(Snake.hiss); //5 - shared all between instances, not care state
```

<h2>Static Final</h2>

```java
public class ZooPen {
    private static final int NUM_BUCKETS = 45;
    public static void main(String[] args) {
        NUM_BUCKETS = 5; // DOES NOT COMPILE
    }
}

public class ZooInventoryManager {
    private static final String[] treats = new String[10];
    public static void main(String[] args) {
        treats[0] = "popcorn";
    }
}

// The height variable is not assigned a value anywhere in the class definition, so that line does not compile.
public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
    static final double height; // DOES NOT COMPILE
    static { bamboo = 5;}
}

private static final int NUM_SECONDS_PER_MINUTE;
private static final int NUM_MINUTES_PER_HOUR;
private static final int NUM_SECONDS_PER_HOUR;
static {
    NUM_SECONDS_PER_MINUTE = 60;
    NUM_MINUTES_PER_HOUR = 60;
}
static {
    NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
}

private static int one;
private static final int two;
private static final int three = 3;
private static final int four; // DOES NOT COMPILE
static {
    one = 1;
    two = 2;
    three = 3; // DOES NOT COMPILE
    two = 4; // DOES NOT COMPILE
}
```

<h2>Class vs Instance Membership</h2>

- A static member cannot call an instance member without referencing an instance of the class
- Only an instance method can call another instance method on the same class without using a reference

```java
public class Gorilla {
    public static int count;
    public static void addGorilla() { count++; }
    public void babyGorilla() { count++; }
    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
    public static void announceBabiesToEveryone() {
        addGorilla();
        babyGorilla(); // DOES NOT COMPILE
    }
    public int total;
    public static double average = total / count; // DOES NOT COMPILE
}

public class Counter {
    private static int count;
    public Counter() { count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        // we didn’t write Counter.count => because we are already in that class
        System.out.println(count); // 3
    }
}
```

