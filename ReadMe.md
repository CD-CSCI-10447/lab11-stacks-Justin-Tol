# Stack Data Structure

## Introduction

A **Stack** is a linear data structure which follows a particular order in which the operations are performed. The order may be LIFO (Last In First Out) or FILO (First In Last Out). It is a collection of elements, with two main principal operations:

* **Push**, which adds an element to the collection, and
* **Pop**, which removes the most recently added element that was not yet removed.

Stacks are widely used in many algorithms and are fundamental in managing how function calls are stored in memory.

## Applications

Some important applications of Stacks include:

* Managing function calls (Call Stack)
* Expression evaluation and syntax parsing
* Backtracking algorithms (like maze or puzzle solving)
* Undo mechanisms in text editors
* Implementing other data structures like queues and trees

## Structure of Stack

A stack can be implemented using an array or linked list. It has only one point of access, i.e., the top of the stack, where elements are pushed or popped. Below is a conceptual representation of a stack:

![](./assets/stack_diagram.png)

To implement a stack, we generally need the following operations:

* `push()`
* `pop()`
* `peek()`
* `isEmpty()`
* `size()`

## Class Stack

The **Stack** class represents the stack data structure. The elements in a stack can be either primitive data types or objects. Here’s a typical structure of a **Stack** class:

![](./assets/stack_class_uml.png)

**Explanation**: This UML diagram outlines a Stack class with methods to manage stack operations. The class is designed to handle generic types, allowing it to store any type of data.

![](./assets/stack_operations.png)

| Operations | Descriptions |
| ---------- | ------------ |
| push       | Adds an element to the top of the stack |
| pop        | Removes and returns the top element of the stack |
| peek       | Returns the top element without removing it |
| isEmpty    | Returns true if the stack is empty |
| size       | Returns the number of elements in the stack |

### push()

This method adds an element to the top of the stack.

#### Time Complexity

The time complexity of `push()` is O(1).

### pop()

This method removes and returns the top element of the stack.

#### Time Complexity

The time complexity of `pop()` is O(1).

### peek()

This method returns the top element without removing it from the stack.

#### Time Complexity

The time complexity of `peek()` is O(1).

### isEmpty()

This method checks if the stack is empty.

#### Time Complexity

The time complexity of `isEmpty()` is O(1).

### size()

This method returns the number of elements in the stack.

#### Time Complexity

The time complexity of `size()` is O(1).

### Instructions to Implement `StackTest`:

1. **Stack Class**:

   1. Complete the class named `StackTest<T>`. 
   2. Implement the methods `push(T data)`, `pop()`, `peek()`, `isEmpty()`, and `size()`.

### Instructions for Unit Testing `Stack`:

1. **Setting up Testing Environment**:
   1.1 Use a testing library (e.g., JUnit for Java).
   1.2 Create a test class named `StackTest`.

2. **Test `push()` and `pop()` Methods**:
   1. Push elements to the stack and assert the size. 
   2. Pop elements and assert the returned value and size after each pop.

3. **Test `peek()` Method**:
   1. After pushing elements, peek and assert the top value without altering the stack size.

4. **Test `isEmpty()` Method**:
   1. Assert that `isEmpty()` returns true for a new stack. 
   2. Assert that `isEmpty()` returns false when elements are present.

5. **Test `size()` Method**:
   1. Push elements and assert that `size()` returns the correct count. 
   2. Pop elements and assert that `size()` updates correctly.

6. **Edge Cases**:
   1. Test the Stack with no elements. 
   2. Test the Stack with a large number of elements. 
   3. Test the Stack's behavior when popping from an empty stack. 
   4. Test pushing various types of elements (if generic).

7. **Final Check**:
   1. Ensure all tests pass. 
   2. Review the Stack implementation for consistency and correct handling of edge cases.

