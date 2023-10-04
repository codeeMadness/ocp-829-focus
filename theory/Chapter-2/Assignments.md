<h2>Assignments</h2>

```java
int value = 3; // Stored as 0011
int complement = ~value; // Stored as 1100
System.out.println(value); // 3
System.out.println(complement); // -4

System.out.println(-1*value - 1); // -4
System.out.println(-1*complement - 1); // 3


int fish = 1.0; // DOES NOT COMPILE //double -> int

short bird = 1921222; // DOES NOT COMPILE // out of range short
short bird = (short)1921222; // Stored as 20678

int mammal = 9f; // DOES NOT COMPILE //float -> int
long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE -> missing post-fixed L
long reptile = (long)192301398193810323; // DOES NOT COMPILE
long reptile = 192301398193810323L;
```

<h2>Compound Assignments</h2>

```java
long goat = 10;
int sheep = 5;
sheep = sheep * goat; // DOES NOT COMPILE
sheep *= goat;
```