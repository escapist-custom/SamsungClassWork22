package com.samsung.homework2.homework2_2_4;

import javax.xml.namespace.QName;

public class MyClass {
    // static int count;
    // static void f() {
    //     count++;
    //     System.out.print(count + " ");
    // }
    // public static void main(String[] args) {
    //     MyClass obj1 = new MyClass();
    //     MyClass obj2 = new MyClass();
    //     obj1.f(); 
    //     obj2.f();
    //     obj1.f();    
    // }


    //-----------------------------------------------------
    // Second task
    static int count;
    public MyClass() {
        count++;
    }
    public static int countObj() {
        return count;
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(), obj2 = new MyClass();
        System.out.println(MyClass.countObj());   
    }
}