<h2>Primitive types</h2>

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/2ac4522d-47e7-4716-a279-76b241e068d4)

```java
//still treat as int because no "l" or "L" follow by numbers
//this number is out of range for int

long max = 3123456789; // DOES NOT COMPILE

```

```java
double notAtStart = _1000.00; // DOES NOT COMPILE
double notAtEnd = 1000.00_; // DOES NOT COMPILE
double notByDecimal = 1000_.00; // DOES NOT COMPILE
double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
double reallyUgly = 1__________2; // Also compiles

int million1 = 1000000; //ugly
int million2 = 1_000_000; //best
```

<h2>Reference Types</h2>

- A reference can be assigned to another object of the same or compatible type.
- A reference can be assigned to a new object using the new keyword.

```java
String greeting = new String("How are you?");

int value = null; // DOES NOT COMPILE
String name = null;

```

<h2>Wrapper Classes</h2>

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/1ad492b9-ddba-4ae9-b450-91b51b146b5a)

<h2>Text Blocks</h2>

```java
//"Java Study Guide"
//by Scott & Jeanne
String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/f14afb51-04b5-4a04-b468-8602ec9e6cc0)



