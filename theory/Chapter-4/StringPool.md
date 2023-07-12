<b>String</b> is immutable and <b>literals are pooled</b>.

The JVM created only one literal in memory. The x and y variables both point to the same location in memory.

```java
var x = "Hello World";
var y = "Hello World";
System.out.println(x == y); // true

var x = "Hello World";
var z = " Hello World".trim();
System.out.println(x == z); // false

var singleString = "hello world";
var concat = "hello ";
concat += "world"; //return a new String
System.out.println(singleString == concat); // false

var x = "Hello World";
var y = new String("Hello World");
System.out.println(x == y); // false

var name = "Hello World";
var name2 = new String("Hello World").intern(); //point to the same reference in the string pool
System.out.println(name == name2); // true

var first = "rat" + 1;
var second = "r" + "a" + "t" + "1";
var third = "r" + "a" + "t" + new String("1");
System.out.println(first == second); //true
System.out.println(first == second.intern()); //true
System.out.println(first == third); //false
System.out.println(first == third.intern()); //true
```

