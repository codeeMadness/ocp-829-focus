- Casting is required when converting from a large data type to a smaller.
- The compiler automatically casts smaller data types to larger ones.

```java
int fish = (int)1.0;
short bird = (short)1921222; // Stored as 20678
int mammal = (int)9f;

float egg = 2.0 / 9; // DOES NOT COMPILE
int tadpole = (int)5 * 2L; // DOES NOT COMPILE
short frog = 3 - 2.0; // DOES NOT COMPILE

//first interpreted as an int
//then is out of range
long reptile = (long)192301398193810323; // DOES NOT COMPILE
```

![image](https://github.com/codeeMadness/leetcode-practice/assets/102911684/906a7cb4-7ab1-4a87-ac6e-ac4ef1d8476b)