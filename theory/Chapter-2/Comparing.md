```java
//you cannot mix types
boolean monkey = true == 3; // DOES NOT COMPILE
boolean ape = false != "Grape"; // DOES NOT COMPILE
boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

boolean bear = false;
boolean polar = (bear = true);
System.out.println(polar); // true

//Two references are equal if and only if they point to the same object or both point to null
var monday = new File("schedule.txt");
var tuesday = new File("schedule.txt");
var wednesday = tuesday;
System.out.println(monday == tuesday); // false
System.out.println(tuesday == wednesday); // true

// only one object is created in memory, but there are three different references to it because Integer inherits both Number and Object
Integer zooTime = Integer.valueOf(9);
Number num = zooTime;
Object obj = zooTime;
```