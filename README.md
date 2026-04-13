# Core Java Lab

`core-java-lab` is a Java practice repository organized by topic so it is
easier to browse, study, and run examples one section at a time. The code
covers beginner to intermediate core Java concepts through small standalone
programs.

## Folder Layout

- `src/fundamentals/` - variables, data types, operators, strings, input, and
  basic language features
- `src/control_flow/` - `if` logic, loops, and flow-control exercises
- `src/arrays_collections/` - arrays, `ArrayList`, `LinkedList`, and `HashMap`
- `src/methods/` - method patterns, return types, static methods, and recursion
- `src/oop/` - classes, constructors, inheritance, abstraction, interfaces,
  encapsulation, and polymorphism
- `src/file_handling/` - file creation, reading, writing, and deletion examples
- `src/Hostel/` - package-based Java examples
- `hello.txt` - sample file used by file handling programs

## Topics Covered

- variables, constants, and primitive data types
- operators, conditions, and ternary expressions
- strings, user input, random values, enums, and exceptions
- loops, nested loops, and flow control
- arrays and Java collections
- methods with and without parameters or return values
- recursion and static methods
- object-oriented programming concepts
- file handling and package usage

## Example Files

- `src/fundamentals/HelloWorld.java` - entry point and static block example
- `src/fundamentals/LearnDataTypes.java` - primitive data type practice
- `src/arrays_collections/ArrayListWork.java` - basic `ArrayList` operations
- `src/arrays_collections/HashMapWork.java` - key-value collection practice
- `src/methods/RecursionWork.java` - recursion examples
- `src/oop/PolymorphismWork.java` - method overriding examples
- `src/oop/Main.java` - object creation and package import example
- `src/file_handling/FileRead.java` - reads content from `hello.txt`
- `src/Hostel/DateTimeWork.java` - date and time examples inside a package

## Compile And Run

Compile all Java files from PowerShell:

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files
```

Run a few sample programs:

```powershell
java -cp out HelloWorld
java -cp out Main
java -cp out Hostel.DateTimeWork
```

## Notes

Most files in this repository are independent learning exercises, so you can
open a folder by topic and run one class at a time while studying. The
`.gitignore` already excludes build output and common IDE files to keep the
repository clean.
