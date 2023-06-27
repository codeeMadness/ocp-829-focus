```java
int hourOfDay = 1;
if(hourOfDay) { // DOES NOT COMPILE
    ...
}
```
<h2>Pattern Variables </h2>

<b>Applied from Java 16</b>

```java
void compareIntegers(Number number) {
    if(number instanceof Integer data) {
        System.out.print(data.compareTo(5));
    }
}

void printIntegersGreaterThan5(Number number) {
    if(number instanceof Integer data && data.compareTo(5)>0)
        System.out.print(data);
}

Integer value = 123;
if(value instanceof Integer) {}
if(value instanceof Integer data) {} // DOES NOT COMPILE
//the last line does not compile because pattern matching requires that the pattern variable type Integer be a strict subtype of Integer.

//OUT OF SCOPE
void printIntegersOrNumbersGreaterThan5(Number number) {
    if(number instanceof Integer data || data.compareTo(5)>0) // DOES NOT COMPILE
        System.out.print(data);
}

void printIntegerTwice(Number number) {
    if (number instanceof Integer data)
        System.out.print(data.intValue());
    System.out.print(data.intValue()); // DOES NOT COMPILE
}

void printOnlyIntegers(Number number) {
    if (!(number instanceof Integer data)) // DOES COMPILE
        return;
    System.out.print(data.intValue());
}
```
