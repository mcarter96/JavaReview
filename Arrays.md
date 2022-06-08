# Arrays

## Definition 

An **array** in Java is a group of like-typed variables referred to by a common name. **Arrays** in Java work differently than they do in C/C++. The following are some important rules about Java **arrays**

- In Java, all **arrays** are dynamically allocated
- Since **arrays** are objects in Java, we can find their length using object property *length*. This is different from C/C++, where we find length using *sizeof*
- A java **array** variable can also be declared like other variables with [] after the data type e.g. int[] arr
- The variables in an **array** are ordered, and each has an index beginning from 0
- Java **arrays** can also be used as a static field, a local variable, or a method parameter
- The size of the **array** must be specified by int or short value and not long
- The direct superclass of an **array** type is [Object](fakelink)
- Every **array** type implements the interfaces ==Clonable== and ==java.io.Serializable==

An **array** can contain primitives (byte, short, int, long, float, double, boolean, char) and object (or non-primitive) references of a class depending on the definiton of the **array**. In the case of primitive data types, the actual values are stored in contiguous memory location. In the case of class objects, the actual objects are stored in a heap segment

## Implementation

The general form of a one-dimensional **array** declaration is: `type[] varName;`. An **array** declaration has two parts: the name and the type. The *type* declares the data type of each element that makes up the **array**. You can declare an **array** with primitive data types or with custom user-defined types (objects).

Examples:
`int[] intArr;`

`boolean boolArr;`

`char charArr;`

`// MyClass is a user-created class`

`MyClass myClassArray[];`


## Complexity

## Uses