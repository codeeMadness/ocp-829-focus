```java
public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.print(name);

        int num = 4;
        newNumber(num);
        System.out.print(num); // 4
    }

    public static void speak(String name) {
        name = "Georgette";
    }

    public static void newNumber(int num) {
        num = 8;
    }
}

public class Dog {
    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name); // WebbyGeorgette
    }
    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}
```

```java
public class ZooTickets {
public static void main(String[] args) {
int tickets = 2; // tickets = 2
String guests = "abc"; // guests = abc
addTickets(tickets); // tickets = 2
guests = addGuests(guests); // guests = abcd
System.out.println(tickets + guests); // 2abcd
}
public static int addTickets(int tickets) {
tickets++;
return tickets;
}
public static String addGuests(String guests) {
guests += "d";
return guests;
}
}
```

<h2>Autoboxing</h2>

```java
Short tail = 8; // Autoboxing
Character p = Character.valueOf('p');
char paw = p; // Unboxing
Boolean nose = true; // Autoboxing
Integer e = Integer.valueOf(9);
long ears = e; // Unboxing, then implicit casting

//Java will implicitly cast a smaller primitive to a larger type, as well as autobox, it will not do both at the same time

Long badGorilla = 8; // DOES NOT COMPILE

Character elephant = null;
char badElephant = elephant; // NullPointerException

public class Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}
    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
        c.jump(123L); // DOES NOT COMPILE
    }
}

public class Gorilla {
    public void rest(Long x) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var g = new Gorilla();
        //Java will cast or autobox the value automatically, but not both at the same time.
        g.rest(8); // DOES NOT COMPILE
    }
}
```