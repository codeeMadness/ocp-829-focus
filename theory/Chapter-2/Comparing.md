```java
//you cannot mix types
boolean monkey = true == 3; // DOES NOT COMPILE
boolean ape = false != "Grape"; // DOES NOT COMPILE
boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

boolean bear = false;
boolean polar = (bear = true);
System.out.println(polar); // true

//Two references are equal if and only if they point to the same object or both point to null
var monday = new File("schedule.txt");
var tuesday = new File("schedule.txt");
var wednesday = tuesday;
System.out.println(monday == tuesday); // false
System.out.println(tuesday == wednesday); // true

// only one object is created in memory, but there are three different references to it because Integer inherits both Number and Object
Integer zooTime = Integer.valueOf(9);
Number num = zooTime;
Object obj = zooTime;
```

<h2>Instance of</h2>

```java
public void openZoo(Number time) {
    if (time instanceof Integer)
        System.out.print((Integer)time + " O'clock");
    else
        System.out.print(time);
}

public void openZoo(Number time) {
    if(time instanceof String) // DOES NOT COMPILE
        System.out.print(time);
}

Object noObjectHere = null;
System.out.print(noObjectHere instanceof String); // false
System.out.print(null instanceof null); // DOES NOT COMPILE

```

<h2>Logical Operator</h2>

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/1047c7f9-ab95-414f-a06b-acfe1f8299e7)

```java
boolean eyesClosed = true;
boolean breathingSlowly = true;
boolean resting = eyesClosed | breathingSlowly;
boolean asleep = eyesClosed & breathingSlowly;
boolean awake = eyesClosed ^ breathingSlowly;
System.out.println(resting); // true
System.out.println(asleep); // true
System.out.println(awake); // false
```

<h2>Conditional Operators</h2>

```java
int hour = 10;
boolean zooOpen = true || (hour < 4);
System.out.println(zooOpen); // true

if(duck!=null & duck.getAge()<5) { // Could throw a NullPointerException
    // Do something
}

if(duck!=null && duck.getAge()<5) {
    // Do something
}

// unperformed side effect
// rabbit >= 6 is true, the increment operator on the right side of the expression is never evaluated, so the output is 6
int rabbit = 6;
boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
System.out.println(rabbit); // 6

int stripes = 7;
System.out.print((stripes > 5) ? 21 : "Zebra");
int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

int sheep = 1;
int zzz = 1;
int sleep = zzz<10 ? sheep++ : zzz++;
System.out.print(sheep + "," + zzz); // 2,1

int sleep = sheep>=10 ? sheep++ : zzz++;
System.out.print(sheep + "," + zzz); // 1,2

```