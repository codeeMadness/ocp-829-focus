```java
int[] moreNumbers = new int[] {42, 55, 99};
//an anonymous array - you don’t specify the type and size.
int[] moreNumbers = {42, 55, 99};

//valid calls
int[] numAnimals;
int [] numAnimals2;
int []numAnimals3;
int numAnimals4[];
int numAnimals5 [];

//two variables of type int[]
int[] ids, types;
//one variable of type int[] and one variable of type int
int ids[], types;

String[] bugs = { "cricket", "beetle", "ladybug" };
String[] alias = bugs;
System.out.println(bugs.equals(alias)); // true
System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
Arrays.toString(bugs) // [cricket, beetle, ladybug]
```

```java
public class Names {
    String names[]; //it is just a reference variable to null
    String names[] = new String[2];//Each of those two slots currently is null but has the potential to point to a String object.
}
```

```java
String[] strings = { "stringValue" };
Object[] objects = strings;
String[] againStrings = (String[]) objects;
againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
objects[0] = new StringBuilder(); // Careful!
```