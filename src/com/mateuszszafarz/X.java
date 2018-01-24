package com.mateuszszafarz;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 1; x <= 10; x++) {
            System.out.println(String.format("%d times %d = %d", x, this.x, this.x * x));
        }
        System.out.println();
    }
}
