# Arrays

## Definition 

An **array** in Java is a group of like-typed variables referred to by a common name. **Arrays** in Java work differently than they do in C/C++. The following are some important rules about Java **arrays**

- In Java, all **arrays** are dynamically allocated
- Since **arrays** are objects in Java, we can find their length using object property *length*. This is different from C/C++, where we find length using *sizeof*
- A java **array** variable can also be declared like other variables with [] after the data type e.g. int[] arr
- The variables in an **array** are ordered, and each has an index beginning from 0
- Java **arrays** can also be used as a static field, a local variable, or a method parameter
- The size of the **array** must be specified by int or short value and not long
- The direct superclass of an **array** type is *Object*
- Every **array** type implements the interfaces *Clonable* and *java.io.Serializable*

An **array** can contain primitives (byte, short, int, long, float, double, boolean, char) and object (or non-primitive) references of a class depending on the definiton of the **array**. In the case of primitive data types, the actual values are stored in contiguous memory location. In the case of class objects, the actual objects are stored in a heap segment

## Implementation

### Declaring an **Array**

The general form of a one-dimensional **array** declaration is: `type[] varName;`. An **array** declaration has two parts: the name and the type. The *type* declares the data type of each element that makes up the **array**. You can declare an **array** with primitive data types or with custom user-defined types (objects).

Examples:
`int[] intArr;`

`boolean boolArr;`

`char charArr;`

`// MyClass is a user-created class`

`MyClass myClassArray[];`

Although the first declaration establishes that intArr is an ****array** variable, no actual array** exists. It merely tells the compiler that this variable will hold an **array** of the integer type. To link intArr to an actual, physical **array** of integers, you must allocate one using new and assign it to intArr.

### Instantiating an **Array**

When an **array** is declared, only a reference of the **array** is created. To create or give memory to the **array**, you create an **array** like this:

`var-name = new type[size];`

Here, *type* specifies the type of data being allocated, *size* determines the number of elements in the **array**, and *var-name* is the name of the **array** variable that is linked to the **array**. To use *new* to allocate an **array**, you must specify the type and numbers of elements to allocate. 

`int intArr[];`

`intArr = new int[20];`

Or you can do it in one line, like so:

`int[] intArr = new int[20];`

- The elements in the **array** allocated by *new* will automatically be initialized to zero, false, or null
- Obtaining an **array** is a two-step process. First, you must declare a variable of the desired **array** type. Second, you must allocate the memory to hold the array, using new, and assign it to the **array** variable. Thus, in Java, all **arrays** are dynamically allocated.

### **Array** of Objects

An **array** of objects is created like an **array** of primitive type data items.

`Student[] arr = new Student[7];`

The student **array** contains seven memory spaces each the size of the student class. The Student objects have to be instantiated using the constructor of the Student class, and their references should be assigned to the **array** elements

### Multidimensional **Arrays**

Multidimensional **arrays** are **arrays** of **arrays** with each element of the **array** holding the reference to the other **arrays**. A multidimensional array is created by appending one set of [] per dimension.

`int[][] int2DArray = new int[10][20];`

### Passing and Returning **Arrays**

You can pass an array as a parameter just like any other variable to a method.

You can also return an array just like any other variable from a method.

### Cloning

When you clone a single-dimensional **array**, a 'deep copy' is performed with the new array containing copies of the original **array**'s elements as opposed to references.

A clone of a multi-dimensional **array** is a 'shallow copy' however. It creats a single new **array** with each element **array** a reference to an original element **array**, but **subarrays** are shared.

## Complexity

Time complexity: O(n)

Space complexity: O(1)

## Advantages of **Array**

- **Arrays** represent multiple data items of the same type using a single name
- In **arrays**, the elements can be accessed randomly by using the index number
- **Arrays** allocate memory in contiguous memory locations for all its elements. Hence there is no chance of extra memory being allocated in case of **arrays**. This avoids memory overflow or shortage of memory in **arrays**
- Using **arrays**, other data structures like linked lists, stacks, queues, trees, graphs, etc, can be implemented
- Two dimensional **arrays** are used to represent matrices

## Disadvantages of **Array**

- The number of elements to be stored in an **array** should be known in advance
- An **array** is a static structure. Once declared, the size of the **array** cannot be modified. The memory which is allocated to it cannot be increased or decreased
- Insertion and deletion are quite difficult in an **array** as the elements are sorted in consecutive memory locations and the shifting operation is costly
- Allocating more memory than the requirement leads to wastage of memory space and less allocation of memory also leads to a problem

## Application of **Arrays**

- **Arrays** store data elements of the same data type
- **Arrays** help to maintain large data under a single variable name
- **Arrays** can be used for sorting data elements. Different sorting techniques like Bubble sort, Insertion sort, Selection sort, etc. use **arrays** to store and sort elements
- Arrays can be used for performing matrix operations. Many databases, small and large, consist of one-dimensional and two-dimensional **arrays** whose elements are records
- **Arrays** can be used for CPU scheduling
- **Arrays** are used to implement other data structure like stacks, queues, heaps, hash tables, etc.
