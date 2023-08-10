- the return type, access modifier, and exception list are irrelevant to overloading
- the method name and parameter list matter.

```java
public class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
}

public class Eagle {
    public void fly(int numMiles) {}
    public int fly(int numMiles) { return 1; } // DOES NOT COMPILE
}

public class Hawk {
    public void fly(int numMiles) {}
    public static void fly(int numMiles) {} // DOES NOT COMPILE
    public void fly(int numKilometers) {} // DOES NOT COMPILE
}
```

<h2>Reference Type</h2>

```java
public class Pelican {
    public void fly(String s) {
        System.out.print("string");
    }
    public void fly(Object o) {
        System.out.print("object");
    }
    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test"); //"string"
        System.out.print("-");
        p.fly(56); //"object"
    }
}

public class Parrot {
    public static void print(List<Integer> i) {
        System.out.print("I");
    }
    public static void print(CharSequence c) {
        System.out.print("C");
    }
    public static void print(Object o) {
        System.out.print("O");
    }
    public static void main(String[] args){
        print("abc"); //C
        print(Arrays.asList(3)); //I
        print(LocalDate.of(2019, Month.JULY, 4)); //O
    }
}
```

<h2>Primitives</h2>

```java
public class Ostrich {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(long l) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123); //int
        System.out.print("-");
        p.fly(123L); //long
    }
}
```

<h2>Autoboxing</h2>

```java
public class Kiwi {
    public void fly(int numMiles) {}
    public void fly(Integer numMiles) {}
}

fly(3) //calling int
```

<h2>Arrays</h2>

```java
//not autoboxing
public static void walk(int[] ints) {}
public static void walk(Integer[] integers) {}
```

<h2>Varargs</h2>

```java
public class Toucan {
    public void fly(int[] lengths) {}
    public void fly(int... lengths) {} // DOES NOT COMPILE
}

fly(new int[] { 1, 2, 3 }); // Allowed to call either fly() method
fly(1, 2, 3); // Allowed to call only the fly() method using varargs
```