package com.mycompany.java5th;

    class over{
    int cal(int x,int y){
    int z;
    z=x +y;
        System.out.println("Using Integer Method");
        System.out.println("Result is: "+z);
        return 0;
    }
    float cal(float m1, float m2){
     float mark;
     mark = m1+m2;
        System.out.println("Using Float Method");
        System.out.println("Using Float Method"+mark);
        return 0;
    }
    int cal(int x){
        System.out.println("Using input output Method");
        System.out.println(x);
        return 0;
    }
    }
public class overloading {
    public static void main(String[] args) {
        over s = new over();
        s.cal(65.2f,40f);
        s.cal(22);
        s.cal(43, 10);

    }
}
