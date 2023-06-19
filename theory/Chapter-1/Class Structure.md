```java
public class Animal {
    String name;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
}
```

<h2>Class's members</h2>

- <b>methods</b>, often called functions or procedures in other languages, 
- <b>fields</b>, more generally known as variables
- Variables hold the state of the program, and Methods operate on that state.

<h3>Method's signature</h3>

the method signature is <i>numberVisitors(int)</i>.

```java
public int numberVisitors(int month) {   
    return 10;
}
```

<h2>Comments</h2>

```java
/* * // anteater */

// bear

// // cat

// /* dog */

/* elephant */

/* * /* ferret */ */ ->invalid
```

<h2>Classes and Source Files</h2>

```java
public class Animal {
    private String name;
}
class Animal2 {}
```

If you have a <b>public</b> type, it needs to <b>match the filename</b>.

The declaration <b>public class Animal2</b> would not compile in a file named <i>Animal.java</i>