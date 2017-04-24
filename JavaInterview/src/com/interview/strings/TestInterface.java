package com.interview.strings;

//@FunctionalInterface
public interface TestInterface {
   // abstract method
    public void square(int a);
 
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
    
    static void show1()
    {
      System.out.println("Static Method Executed");
    }
    
    //void a();
    
    @Override
    public String toString();
    @Override
    public boolean equals(Object obj);
    
}