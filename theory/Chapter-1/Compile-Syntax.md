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