```java
//The date and time classes have private constructors
var d = new LocalDate(); // DOES NOT COMPILE

var d = LocalDate.of(2022, Month.JANUARY, 32) // DateTimeException - should be 31
```