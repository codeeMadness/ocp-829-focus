<h2>Important <b>javac</b> options</h2>

<table>
    <tr>
        <th>Option</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>
            -cp >classpath<
        </td>
        <td>
            Location of classes needed to compile the program
        </td>
    </tr>
    <tr>
        <td>
            -classpath >classpath<
        </td>
        <td>  
            Location of classes needed to compile the program
        </td>
    </tr>
    <tr>
        <td>
            --class-path >classpath<
        </td>
        <td>
            Location of classes needed to compile the program
        </td>
    </tr>
    <tr>
        <td>
            -d >dir<
        </td>
        <td>
            Directory in which to place generated class files
        </td>
    </tr>
    <tr>
        <td>
            <i>javac -d classes packagea/ClassA.java packageb/ClassB.java</i>
        </td>
        <td>
        </td>
    </tr>
</table>

<h2>Important <b>java</b> options</h2>

<table>
    <tr>
        <th>Option</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>
            -cp >classpath<
        </td>
        <td>
            Location of classes needed to run the program
        </td>
    </tr>
    <tr>
        <td>
            <i>java -cp classes packageb.ClassB</i>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>
            -classpath >classpath<
        </td>
        <td>  
            Location of classes needed to run the program
        </td>
    </tr>
    <tr>
        <td>
            <i>java -classpath classes packageb.ClassB</i>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>
            --class-path >classpath<
        </td>
        <td>
            Location of classes needed to run the program
        </td>
    </tr>
    <tr>
        <td>
            <i>java --class-path classes packageb.ClassB</i>
        </td>
        <td></td>
    </tr>
</table>

<h2>Important <b>jar</b> options</h2>

<table>
    <tr>
        <th>Option</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>
            -c / --create
        </td>
        <td>
            Creates a new JAR fil
        </td>
    </tr>
    <tr>
        <td>
            -v / --verbose
        </td>
        <td>Prints details when working with JAR files</td>
    </tr>
    <tr>
        <td>
            -f >fileName< / --file >fileName<
        </td>
        <td>  
            JAR filename
        </td>
    </tr>
    <tr>
        <td>
            -C >directory< 
        </td>
        <td>Directory containing files to be used to create the JAR</td>
    </tr>
    <tr>
        <td>
            <i>jar -cvf myNewFile.jar</i>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>
            <i>jar -cvf myNewFile.jar -C dir</i>
        </td>
        <td></td>
    </tr>
    <tr>
        <td>
            <i>jar --create --verbose --file myNewFile.jar</i>
        </td>
        <td></td>
    </tr>

</table>

<h2>Ordering</h2>

```java
package structure; // package must be first non-comment. No required

import java.util.*; // import must come after package. No required

public class Meerkat { // then comes the class. Required

    double weight; // fields and methods can go in either order. No required

    public double getWeight() {
        return weight; 
    }
    
    double height; // another field - they don't need to be together. No required
}
```

```java
// result: number = 5
// Fields and blocks are run first in order, setting number to 3 and then 4
// Then the constructor runs, setting number to 5
public class Egg {
    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    private int number = 3;
    { number = 4; } 
}
```

<h2>Identifiers</h2>

■Identifiers must begin with a letter, a currency symbol, or a _ symbol. Currency symbols include dollar ($), yuan (¥), euro (€), and so on.

■ Identifiers can include numbers but not start with them.

■ A single underscore _ is not allowed as an identifier.

■ You cannot use the same name as a Java keyword (A reserved word).

<h2>Declaring Multiple Variables</h2>

```java
void sandFence() {
    String s1, s2; // not initialize
    String s3 = "yes", s4 = "no";
    
    int i1, i2, i3 = 0; //only i3 is initialized

    int num, String value; // DOES NOT COMPILE
}
```