package com.mycompany.extendedclass;

/**
 * класс, кот-ый содержит вызов методов
 */
public class Main {
   public static void main (String [] args){
       ExtendedClass variable0 = new ExtendedClass((byte)0, 2, 3.0, "рекурсия");
       ExtendedClass variable1 = new ExtendedClass((byte)0, 2, 3.0, "рекурсия");
       ExtendedClass variable2 = new ExtendedClass((byte)1, 7, 5.2, "стоп");
       System.out.println(variable0);
       System.out.println(variable1);
       System.out.println(variable2);
       System.out.println(variable0.hashCode());
       System.out.println(variable1.hashCode());
       System.out.println(variable2.hashCode());
       System.out.println(variable0.equals(variable0));
       System.out.println(variable1.equals(variable0));
       System.out.println(variable2.equals(variable0));
       System.out.println(variable2.equals(variable1));
       
   } 
}
