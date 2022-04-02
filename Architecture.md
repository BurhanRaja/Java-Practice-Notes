## Architecture of Java

### How Java executes?

```
            compiler                  interpreter
          (entire file)                (0 and 1)
Java Code --------------> Byte Code --------------> Machine Code
```

Java code is written by humans in '.java' file

Byte code is the converted form of '.java' file in '.class' file. 
This code is ran on the JVM (Java Virtual Machine).
This is the reseason why java is platform independent language.

Machine code is the converted form of Byte code.
It is then ran on machine system.


### What is platform independent means?

* Platform independent means that the byte code can run on any operating system.
* Byte code helps java to convert the source code to machine code, so that the machine can understand and execute the desired program.
* Java is platform-independent but JVM is platform-dependent means JVM is to be downloaded according to the the requirements of operating system.

### JDK vs JRE vs JVM vs JIT

- JDK (Java Development Kit) consists of 'JRE (Java Runtime Environment)' and 'Development tools'.
- JRE consits of JVM (Java Virtual Machine) and Library Classes.
- JVM consists of JIT (Just In Time).


#### JDK

- JDK provides an environment for development
- It includes:-
    - Development tools = Tools required to develop your program in an environment
    - JRE = to execute your program
    - Provides a compiler = javaC
    - archiver = jar
    - docs generator = javadoc
    - interpreter / loader

#### JRE

- JRE is a installation package which provides an environment to just run the program
- It includes:-
    - Deployment technologies (Java Plug-in etc.)
    - User Interface libraries (AWT, JavaFx, Swing etc.)
    - Integration Libraries (Caplin System etc.)
    - Base Libraries (Jackson, JUnit etc.)
    - JVM

#### Compile Time and Run Time

- 1st is compile time
- 2nd is Runtime

```
                javaC (compiler)
.java file ----------------------> .class file

class Loader ------> Byte code verifier ------> Interpreter ------> Run Time -----> Hardware

```
JVM Working:-
1. Loading 
- Class loader loads the .class file and generate binary data.
- An object is stored in heap memory.

2. Linking
- JVM verifies the code in .class file.
- Allocates memory to class variables and default variables.
- Replace the symbolic refereneces with the type direct references.

3. Intializing (Object Oriented Programming)
- All static variables are assigned with their values defined in the code and static block.

JVM contains stack and heap memory allocations.

JVM Execution:-
4. Interpreting 
- Line by Line execution
- By calling a method many times, it will have to interpret again and again.

5. Just in time
- Those methods that are ran repeatedly, JIT can provide direct machine code, so that re-interpretation not takes place.


### Java Architecture

```
Java code ---> JDK (javaC compiler) ---> Byte Code ---> JVM ---> JRE
                                                     (Hardware)
```