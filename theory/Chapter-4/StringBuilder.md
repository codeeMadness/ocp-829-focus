```java
//after 26 iterations through the loop, a total of 27 objects are instantiated
 String alpha = "";
 for(char current = 'a'; current <= 'z'; current++)
    alpha += current;
 System.out.println(alpha);
```

- StringBuilder is mutable

```java
//reuses the same StringBuilder without creating an interim String each time
 StringBuilder alpha = new StringBuilder();
 for(char current = 'a'; current <= 'z'; current++)
    alpha.append(current);
 System.out.println(alpha);
```

- <i>String Buffer</i> works the same way, except it supports threads but performs slower than <i>StringBuilder</i>
- When we chained <i>String</i> method calls, the result was a new String with the answer. The <i>StringBuilder</i> changes its own state and returns a reference to itself.

```java
//sb and same point to the same object
StringBuilder sb = new StringBuilder("start");
sb.append("+middle"); // sb = "start+middle"
StringBuilder same = sb.append("+end"); // "start+middle+end"

// a = b = "abcdefg"
StringBuilder a = new StringBuilder("abc");
//new StringBuilder() is called only once
StringBuilder b = a.append("de");
b = b.append("f").append("g");
System.out.println("a=" + a);
System.out.println("b=" + b);

var sb = new StringBuilder("animals");
//substring() returns a Stringrather than a StringBuilder. That is why sbis not changed. 
String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
int len = sb.length();
char ch = sb.charAt(6);
System.out.println(sub + " " + len + " " + ch); //anim 7 s

var sb = new StringBuilder().append(1).append('c');
sb.append("-").append(true);
System.out.println(sb); // 1c-true

var sb = new StringBuilder("animals");
sb.insert(7, "-"); // sb = animals-
sb.insert(0, "-"); // sb = -animals-
sb.insert(4, "-"); // sb = -ani-mals-
System.out.println(sb);

var sb = new StringBuilder("abcdef");
sb.delete(1, 3); // sb = adef
sb.deleteCharAt(5); // exception

var sb = new StringBuilder("abcdef");
sb.delete(1, 100); // sb = a

var builder = new StringBuilder("pigeon dirty");
builder.replace(3, 6, "sty");
System.out.println(builder); // pigsty dirty
builder.replace(3, 100, "");
System.out.println(builder); // pig

var sb = new StringBuilder("ABC");
sb.reverse();
System.out.println(sb);
```

<h2>Equals</h2>

- "==" is checking for object reference equality
- equals() uses logical equality
  

```java
var one = new StringBuilder();
var two = new StringBuilder();
var three = one.append("a");
System.out.println(one == two); // false
System.out.println(one == three); // true

//check the values inside the String rather than the string reference itself
var x = "Hello World";
var z = " Hello World".trim();
System.out.println(x.equals(z)); // true

//they are completely different types
var name = "a";
var builder = new StringBuilder("a");
System.out.println(name == builder); // DOES NOT COMPILE
```


