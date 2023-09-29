<h1>LocalDate</h1>

- <b>LocalDate</b> just date (no matter time and timezone)
- <b>LocalTime</b> just time (no timezone)
- <b>LocalDateTime</b> date and time (no timezone)
- <b>ZonedDateTime</b> Contains a date, time, and time zone

```java
//The date and time classes have private constructors
var d = new LocalDate(); // DOES NOT COMPILE

var d = LocalDate.of(2022, Month.JANUARY, 32) // DateTimeException - should be 31

var date = LocalDate.of(2024, Month.JANUARY, 20);
date.plusDays(10);
System.out.println(date); //still print January 20, 2024
date = date.plusDays(10); // January 30, 2024

//LocalDate does not contain time. This means that you cannot add minutes to it
var date = LocalDate.of(2024, Month.JANUARY, 20);
date = date.plusMinutes(1); // DOES NOT COMPILE
```

```java
var one = LocalTime.of(5, 15);
var two = LocalTime.of(6, 30);
var date = LocalDate.of(2016, 1, 20);
System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException

LocalTime time = LocalTime.of(3,12,45);
System.out.println(time); // 03:12:45
LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
System.out.println(truncated); // 03:12
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/d5639e4b-5333-4b16-b81f-a3b99f202ed1)

<h1>Period</h1>

- Period is a day or more of time

```java
var annually = Period.ofYears(1); // every 1 year
var quarterly = Period.ofMonths(3); // every 3 months
var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
var everyOtherDay = Period.ofDays(2); // every 2 days
var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 day

var date = LocalDate.of(2022, 1, 20);
var time = LocalTime.of(6, 15);
var dateTime = LocalDateTime.of(date, time);
var period = Period.ofMonths(1);
System.out.println(date.plus(period)); // 2022–02–20
System.out.println(dateTime.plus(period)); // 2022–02–20T015
//add a month to an object that has only a time
System.out.println(time.plus(period)); // Exception
```

<h1>Duration</h1>

- For Duration, you can specify the number of days, hours, minutes, seconds, or nanoseconds

```java
var date = LocalDate.of(2022, 1, 20);
var time = LocalTime.of(6, 15);
var dateTime = LocalDateTime.of(date, time);
var duration = Duration.ofHours(6);
System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
System.out.println(time.plus(duration)); // 12:15
System.out.println(date.plus(duration)); // UnsupportedTemporalTypeException

var date = LocalDate.of(2022, 5, 25);
var period = Period.ofDays(1);
var days = Duration.ofDays(1);
System.out.println(date.plus(period)); // 2022–05–26
System.out.println(date.plus(days)); // Unsupported unit: Seconds
```

<h1>Daylight Saving</h1>

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/99dc19df-71a2-417b-b884-e3100f956ed5)

```java
var date = LocalDate.of(2022, Month.MARCH, 13);
var time = LocalTime.of(1, 30);
var zone = ZoneId.of("US/Eastern");
var dateTime = ZonedDateTime.of(date, time, zone);
System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
dateTime = dateTime.plusHours(1);
System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]

var date = LocalDate.of(2022, Month.NOVEMBER, 6);
var time = LocalTime.of(1, 30);
var zone = ZoneId.of("US/Eastern");
var dateTime = ZonedDateTime.of(date, time, zone);
System.out.println(dateTime); // 2022-11-06T01:30-04:00[US/Eastern]

dateTime = dateTime.plusHours(1);
System.out.println(dateTime); // 2022-11-06T01:30-05:00[US/Eastern]
dateTime = dateTime.plusHours(1);
System.out.println(dateTime); // 2022-11-06T02:30-05:00[US/Eastern]
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/624e66a3-bed9-4c65-ab98-b051a52c8010)
