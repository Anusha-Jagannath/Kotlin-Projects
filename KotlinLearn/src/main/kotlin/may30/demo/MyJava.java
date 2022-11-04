package may30.demo;

import may31.DefaultFunctionKt;

public class MyJava {

    public static void main(String[] args) {
        int sum = MyKotlinKt.add(3);
        int result = DefaultFunctionKt.findVolume(2, 3);
        System.out.println(result);
        System.out.println(sum);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}
