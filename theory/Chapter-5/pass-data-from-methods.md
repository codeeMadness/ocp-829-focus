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