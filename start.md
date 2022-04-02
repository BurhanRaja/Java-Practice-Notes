// Java Introduction Notes:-


// ************* Types of languages ***************

// 1. Procedural - Sequencial Programming Language
// 2. Functional - bulk of procedures Programming Language
// 3. Object Oriented - bulk of functional Programming Language

// 4. Static - You have to mention the Dtype of the variable. For example in C++.
// 5. Dynamic - You do not have to mention the Dtype of the variable. For example in Python.

// (Compile Time - It means to convert the program into the machine code)
// (Run Time - It means to running time of the code after comopiling)



// ************* Memory Management ***************

// Types of Memory:-

// 1. Stack

// *           *
// *           *
// *           *
// *           *
// *           *
// *           *
// *           *
// *************

// 2. Heap

//       ********
//      *        *
//     *          *
//    *            *
//   *              *


// **** For example **** :-
// a=10
// a is called reference variable
// 10 is called object

// *           *                   ******
// *           *                  *      *
// *           *                 *        *
// *           *                *          *
// *     a-------------------------> 10     *
// *           *              *              *
// *           *             *                *
// *************

// a is stored in stack and 10 is stored in heap
// a points towards 10; a points towards address of 10
// Every object has its own address in the memory or RAM.



// ********** Object Oriented **********

// If an object have many reference variable:-

// a --------------------> 10
// b ----------|
// c ----------|
// d ----------|

// Here a, b, c, d is all points towards 10.
// If the object is changed to 11 than all the object of the variables will point towards 11.



//  ********** Garbage Collection **********

// Take the above example

// If 
// a --------------------> 11
// b ----------|
// c ----------|
// d ----------|

// then
// 10 will be collected in garbage collection and removed from the memory

