<h2>For</h2>

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

int x = 0;
for(int x = 4; x < 5; x++) // DOES NOT COMPILE
    System.out.print(x + " ");

nt x = 0;
for(x = 0; x < 5; x++)
    System.out.print(x + " ");

//different types in for statement
int x = 0;
for(long y = 0, int z = 4; x < 5; x++) // DOES NOT COMPILE
    System.out.print(y + " ");

//outside loop scope
for(long y = 0, x = 4; x < 5 && y < 10; x++, y++)
    System.out.print(y + " ");
System.out.print(x); // DOES NOT COMPILE

//unreachable code
int checkDate = 0;
while(checkDate<10) {
    checkDate++;
    if(checkDate>100) {
        break;
        checkDate++; // DOES NOT COMPILE
    }
}
```

<h2>For Each</h2>

```java
//it has to actually be an array or implement Iterable
String birds = "Jay";
for(String bird : birds) // DOES NOT COMPILE
    System.out.print(bird + " ");

//mismatch type
String[] sloths = new String[3];
for(int sloth : sloths) // DOES NOT COMPILE
    System.out.print(sloth + " ");
```

<h2>Label</h2>

```java
int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
    INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
        System.out.print(mySimpleArray[i]+"\t");
    }
    System.out.println();
}

PARENT_LOOP: for(int i=0; i<list.length; i++) {
    for(int j=0; j<list[i].length; j++) {
        if(list[i][j]==searchValue) {
            positionX = i;
            positionY = j;
            break PARENT_LOOP;
        }
    }
}

public class CleaningSchedule {
    public static void main(String[] args) {
        CLEANING: for(char stables = 'a'; stables<='d'; stables++) {
            for(int leopard = 1; leopard<4; leopard++) {
                if(stables=='b' || leopard==2) {
                    continue CLEANING;
                }
                System.out.println("Cleaning: "+stables+","+leopard);
            } 
        } 
    } 
}

//unreachable code
int minute = 1;
WATCH: while(minute>2) {
    if(minute++>2) {
        continue WATCH;
        System.out.print(minute); // DOES NOT COMPILE
    }
}

int hour = 2;
switch(hour) {
    case 1: return; hour++; // DOES NOT COMPILE
    case 2:
}

```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/f6801fd2-5cea-4c61-9ade-0036ff221338)
