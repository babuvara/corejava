package com.chainsys.introduction;

class Parent {
    public void print()
    {
        System.out.println(" Hello");
}
}
class Child extends Parent {
    public void print()
    {
        System.out.println("How Are You !");
    }
    public static void main(String[] args)
    {
       
        Child st = new Child();
       st.print();
    }
}