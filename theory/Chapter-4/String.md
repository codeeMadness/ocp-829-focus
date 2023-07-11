- a String is <b>immutable, or unchangeable</b> => calling a method on a String will return a different String object rather than changing the value of the reference.

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

<h3>Equals</h3>

```java
var name = "animals";
System.out.println(name.substring(3, 3)); // empty string
System.out.println(name.substring(3, 2)); // exception
System.out.println(name.substring(3, 8)); // exception

public boolean equals(Object obj)
public boolean equalsIgnoreCase(String str)
```

<h3>Strip</h3>

```java
String text = " abc\t ";
System.out.println(text.trim().length()); // 3 "abc"
System.out.println(text.strip().length()); // 3 "abc"
System.out.println(text.stripLeading().length()); // 5 "abc\t "
System.out.println(text.stripTrailing().length());// 4 "_abc"
```

<h3>Indent</h3>

```java
 var block = """
 a
 b
 c""";
 var concat = " a\n"
 + " b\n"
 + " c";
 System.out.println(block.length()); // 6 "a\n_b\nc"
 System.out.println(concat.length()); // 9 "_a\n__b\n_c"

 //text block doesn’t have a line break at the end, indent() adds one
 System.out.println(block.indent(1).length()); // 10 "_a\n__b\n_c\n"
 System.out.println(concat.indent(-1).length()); // 7 "a\n_b\nc\n"
 System.out.println(concat.indent(-4).length()); // 6 "a\nb\nc\n"
 System.out.println(concat.stripIndent().length()); // 6 "a\n_b\nc"
```

<h3>Translating Escapes</h3>

```java
var str = "1\\t2";
System.out.println(str); // 1\t2
System.out.println(str.translateEscapes()); // 1 2
// can be used for escape sequences such as \t (tab), \n (new line), \s (space), \" (double quote), and \' (single quote.)
```

<h3>Formatted</h3>

```java
var name = "James";
var score = 90.25;
var total = 100;
System.out.println("%s:%n Score: %f out of %d".formatted(name, score, total));

//James:
//  Score: 90.250000 out of 100

var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException

var pi = 3.14159265359;
System.out.format("[%f]",pi); // [3.141593]
System.out.format("[%12.8f]",pi); // [ 3.14159265]
System.out.format("[%012f]",pi); // [00003.141593]
System.out.format("[%12.2f]",pi); // [ 3.14]
System.out.format("[%.3f]",pi); // [3.142]
```

<h3>Chaining</h3>

```java
//creates four String objects and outputs AnimAl
var start = "AniMaL ";
var trimmed = start.trim(); // "AniMaL"
var lowercase = trimmed.toLowerCase(); // "animal"
var result = lowercase.replace('a', 'A'); // "AnimAl"
System.out.println(result);
//same with previous
String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
System.out.println(result);

 String a = "abc";
 String b = a.toUpperCase();
 b = b.replace("B", "2").replace('C', '3');
 System.out.println("a=" + a); //abc
 System.out.println("b=" + b); //A23
```