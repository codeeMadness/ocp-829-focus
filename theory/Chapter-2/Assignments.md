![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/646c3682-2faf-4089-b4dd-165bdc7b6508)

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/15581758-0aa8-4185-9d5b-decc96c7e2ac)

<h2>Numeric Promotion</h2>

```java
// If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
int x = 1;
long y = 33;
var z = x * y; //z have long value

double x = 39.21;
float y = 2.1; //does not compile bc without post-fixed with an f
float y = 2.1f;
var z = x + y; //z have double value

// Smaller data types, namely, byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator with a variable (as opposed to a value), even if neither of the operands is int.
short x = 10;
short y = 3;
var z = x * y; //z have int value

short w = 14; //promoted to int then promoted to float
float x = 13;
double y = 30;
var z = w * x / y; //w * x will be promoted to double

short mouse = 10;
short hamster = 3;
short capybara = mouse * hamster; // DOES NOT COMPILE
short capybara = (short)mouse * hamster; // DOES NOT COMPILE
short capybara = 1 + (short)(mouse * hamster); // DOES NOT COMPILE
short capybara = (short)(mouse * hamster);

byte hat = 1;
byte gloves = 7 * 10;
short scarf = 5;
short boots = 2 + 1;
short boots = 2 + hat; // DOES NOT COMPILE //both promoted to int
byte gloves = 7 * 100; // DOES NOT COMPILE // out of range byte

```

<h2>Assignments</h2>

```java
int fish = 1.0; // DOES NOT COMPILE //double -> int

short bird = 1921222; // DOES NOT COMPILE // out of range short
short bird = (short)1921222; // Stored as 20678

int mammal = 9f; // DOES NOT COMPILE //float -> int
long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE -> missing post-fixed L
long reptile = (long)192301398193810323; // DOES NOT COMPILE
long reptile = 192301398193810323L;

long wolf = 5;
long coyote = (wolf=3);
System.out.println(wolf); // 3
System.out.println(coyote); // 3

// this snippet printing Good!
boolean healthy = false;
if(healthy = true)
    System.out.print("Good!");

```

<h2>Compound Assignments</h2>

```java
long goat = 10;
int sheep = 5;
sheep = sheep * goat; // DOES NOT COMPILE
sheep *= goat;
```