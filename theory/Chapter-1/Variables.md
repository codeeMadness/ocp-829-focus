<h2>Final Local Variables</h2>

```java
final int y = 10;
int x = 20;
y = x + 10; // DOES NOT COMPILE

final int[] favoriteNumbers = new int[10];
favoriteNumbers[0] = 10;
favoriteNumbers[1] = 20;
favoriteNumbers = null; // DOES NOT COMPILE
```

<h2>Uninitialized Local Variables</h2>

```java
public void findAnswer(boolean check) {
    int answer;
    int otherAnswer;
    int onlyOneBranch;
    if (check) {
        onlyOneBranch = 1;
        answer = 1;
    } else {
        answer = 2;
    }
    System.out.println(answer);
    System.out.println(onlyOneBranch); // DOES NOT COMPILE
}

public void checkAnswer() {
    boolean value;
    findAnswer(value); // DOES NOT COMPILE
}
```

<h2>Type <b>Var</b> - local variable type inference</h2>

```java
public class Zoo {

    var tricky = "Hello"; // DOES NOT COMPILE
    var n = null; // DOES NOT COMPILE

    // only use var for local
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    public void reassignment() {
        var number = 7;
        number = 4;
        number = "five"; // DOES NOT COMPILE
    }
}

public void doesThisCompile(boolean check) {
    var question; // DOES NOT COMPILE
    question = 1;
    var answer; // DOES NOT COMPILE
    if (check) {
        answer = 2;
    } else {
        answer = 3;
    }
    System.out.println(answer);
}

public int addition(var a, var b) { // DOES NOT COMPILE
    return a + b;
}

```

**var is not a reserved word and allowed to be used as an identifier.**

```java
// these piece of code does compile
package var;
public class Var {
    public void var() {
        var var = "var";
    }
    public void Var() {
        Var var = new Var();
    }
}
```