```java
for(int i=0; i < 10; i++)
    System.out.println("Value is: "+i);
System.out.println(i); // DOES NOT COMPILE

int i;
for(i=0; i < 10; i++)
    System.out.println("Value is: "+i);
System.out.println(i);

```

```java
// Creating an Infinite Loop
for( ; ; )
    System.out.println("Hello World");

// Adding Multiple Terms to the for Statement
int x = 0;
for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
    System.out.print(y + " "); }
System.out.print(x + " ");
```