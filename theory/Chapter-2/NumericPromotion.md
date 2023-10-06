![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/c8a21bba-e96b-4a2c-b722-995dd8768dc1)


```java
// RULE 1
int x = 1;
long y = 33;
var z = x * y; //z have long value

double x = 39.21;
float y = 2.1f;
var z = x + y; //z have double value
```

```java
// RULE 3
short x = 10;
short y = 3;
var z = x * y; //z have int value


float x = 13;
double y = 30;
short w = 14;
//w promoted to int then promoted to float
//w * x then will be promoted to double
var z = w * x / y; 

short mouse = 10;
short hamster = 3;
short capybara = mouse * hamster; // DOES NOT COMPILE
short capybara = (short)(mouse * hamster);

short capybara = (short)mouse * hamster; // DOES NOT COMPILE
short capybara = 1 + (short)(mouse * hamster); // DOES NOT COMPILE


byte hat = 1;
byte gloves = 7 * 10;
short scarf = 5;
short boots = 2 + 1;
short boots = 2 + hat; // DOES NOT COMPILE //both promoted to int
byte gloves = 7 * 100; // DOES NOT COMPILE // out of range byte
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/63341b68-d0dc-4aef-b1a4-cdef052c0cb9)

