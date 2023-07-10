```java
//Both give you a reference variable named name pointing to the String object "Fluffy"
String name = "Fluffy";
String name = new String("Fluffy");

//evaluated left to right
System.out.println(1 + 2); // 3
System.out.println("a" + "b"); // ab
System.out.println("a" + "b" + 3); // ab3
System.out.println(1 + 2 + "c"); // 3c
System.out.println("c" + 1 + 2); // c12
System.out.println("c" + null); // cnull
```

- a String is <b>immutable, or unchangeable</b> => calling a method on a String will return a different String object rather than changing the value of the reference.

```java
var name = "animals";
System.out.println(name.substring(3, 3)); // empty string
System.out.println(name.substring(3, 2)); // exception
System.out.println(name.substring(3, 8)); // exception

public boolean equals(Object obj)
public boolean equalsIgnoreCase(String str)

String text = " abc\t ";
System.out.println(text.trim().length()); // 3
System.out.println(text.strip().length()); // 3
System.out.println(text.stripLeading().length()); // 5
System.out.println(text.stripTrailing().length());// 4
```