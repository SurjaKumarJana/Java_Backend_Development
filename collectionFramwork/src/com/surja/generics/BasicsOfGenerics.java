
/*
 Java Generics
--------------------------------------------------------------------------------
 What are Generics?

→ Generics allow you to write code that works with any data type.
→ They provide type safety and code reusability by using type parameters.

Syntax:  ClassName<T> or MethodName<T>

--------------------------------------------------------------------------------
 Benefits of Generics:

1. Type Safety:
   - Catch type errors at compile time, not at runtime.
   - Prevents ClassCastException.

2. Code Reusability:
   - You write one class/method that works for any type (Integer, String, etc.)

3. Cleaner Code:
   - No need for manual casting.

--------------------------------------------------------------------------------
 Common Generic Classes (in Java Collection Framework):

- List<T> → ArrayList<String>, LinkedList<Integer>, etc.
- Set<T>  → HashSet<Double>
- Map<K, V> → HashMap<String, Integer>



--------------------------------------------------------------------------------
 Bounded Types (Restrict type)

<T extends Number>
→ Only allows Number and its subclasses (Integer, Double, Float, etc.)

Example:
class Calculator<T extends Number> {
    T num;
    ...
}

--------------------------------------------------------------------------------
 Wildcards in Generics:

1. <?>           → Unknown type
2. <? extends T> → Any subclass of T
3. <? super T>   → Any superclass of T

Example:
List<?>                 → Accepts any type
List<? extends Number>  → Accepts Integer, Float, Double
List<? super Integer>   → Accepts Integer, Number, Object

--------------------------------------------------------------------------------
 What Generics Can't Do:

- Cannot use primitive types (int, double...) directly → use wrappers (Integer, Double)
- Cannot create objects of type parameter: new T() // Not allowed
- Cannot use instanceof with generic type

--------------------------------------------------------------------------------
 Summary:

→ Generics = Type-safe and reusable code.
→ Helps reduce casting, catch errors early, and write cleaner code.

*/


package com.surja.generics;

public class BasicsOfGenerics {

    public static void main(String[] args) {

        Box box = new Box();// in this box we can put any thing
        box.put(123);// we can put Integer
        box.put("Sunday");// we can put String
        box.put(145.25);// we can put Float
        box.put(new Box());// a object of Box class

        // hence the issue occured in type safety

        //solution
        // we use generics
        // generics can be used at
        //1. method level
        box.putSpecific(123);
        //box.putSpecific("Sldlf");// as this is not a Number it will show error at compile time only
        box.show();
        // 2. class level
        TypeSafeBox<Integer> typeSafeBox = new TypeSafeBox();
        typeSafeBox.put(123);// allowed
        //typeSafeBox.put(34.4);// not allowed
       // typeSafeBox.put("123");// not allowed

        typeSafeBox.show();

    }
}
