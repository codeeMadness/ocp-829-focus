<h3>Private</h3>

- the method can be called only from within the same class.

<h3>Package Access</h3>

- default access
- You simply omit the access modifier.
- the method can be called only from a class in the same package.

<h3>Protected</h3>

- the method can be called only from a class in the same package or a subclass.

<h3>Public</h3>

- the method can be called from anywhere.

```java
public class ParkTrip {
    public void skip1() {}

    //no access modifier called default
    default void skip2() {} // DOES NOT COMPILE

    //wrong order
    void public skip3() {} // DOES NOT COMPILE

    void skip4() {}
}
```

- access modifiers and optional specifiers can appear in any order

![image](https://github.com/codeeMadness/ocp-829-focus/assets/102911684/3d2fbc19-5ce9-4534-a7ac-7134ecca1a01)

