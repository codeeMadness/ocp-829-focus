```java
int[] moreNumbers = new int[] {42, 55, 99};
//an anonymous array - you don’t specify the type and size.
int[] moreNumbers = {42, 55, 99};

//valid calls
int[] numAnimals;
int [] numAnimals2;
int []numAnimals3;
int numAnimals4[];
int numAnimals5 [];

//two variables of type int[]
int[] ids, types;
//one variable of type int[] and one variable of type int
int ids[], types;

String[] bugs = { "cricket", "beetle", "ladybug" };
String[] alias = bugs;
System.out.println(bugs.equals(alias)); // true
System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
Arrays.toString(bugs) // [cricket, beetle, ladybug]
```

```java
public class Names {
    String names[]; //it is just a reference variable to null
    String names[] = new String[2];//Each of those two slots currently is null but has the potential to point to a String object.
}
```

```java
String[] strings = { "stringValue" };
Object[] objects = strings;
String[] againStrings = (String[]) objects;
againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
objects[0] = new StringBuilder(); // Careful!
```

```java
int[] numbers = {2,4,6,8};
System.out.println(Arrays.binarySearch(numbers, 2)); // 0
System.out.println(Arrays.binarySearch(numbers, 4)); // 1
System.out.println(Arrays.binarySearch(numbers, 1)); // -1
System.out.println(Arrays.binarySearch(numbers, 3)); // -2
System.out.println(Arrays.binarySearch(numbers, 9)); // -5

int[] numbers = new int[] {3,2,1};
System.out.println(Arrays.binarySearch(numbers, 2)); //1
// wrong answer bc the list is not sorted
System.out.println(Arrays.binarySearch(numbers, 3)); 
```

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/60935c9a-cb1d-42c7-8c04-c0bb0db5922c)

```java
System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"})); // DOES NOT COMPILE
```

```java
System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); //-1
System.out.println(Arrays.mismatch(new String[] {"a"},new String[] {"A"})); //0
System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1})); //1
```

<h2>Multi-dimensional</h2>

```java
int[][] vars1; // 2D array
int vars2 [][]; // 2D array
int[] vars3[]; // 2D array
int[] vars4 [], space [][]; // a 2D AND a 3D array

String [][] rectangle = new String[3][2];
```