package common.rules;

public class Salmon {
    int count;
    {
        System.out.println(count + "-");
    }
    {
        count = 1;
        System.out.println(count+"-");
    }
    public Salmon() {
        System.out.println(2 + "-");
    }

    public static void main(String[] args) {
//        int gills = 0, w = 2;
//        var s = new Salmon();
        var s = "Hello";
        var t = new String(s);
//        if("Hello".equals(s)) System.out.println("one");
        System.out.println(t.intern());
    }
}
