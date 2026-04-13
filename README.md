# Core Java Lab

`core-java-lab` is a hands-on Java practice repository with small examples for
core language concepts. The project is organized as standalone Java programs
that explore syntax, control flow, object-oriented programming, collections,
file handling, and package-based examples.

## Repository Structure

- `src/` - main set of Java practice files
- `src/Hostel/` - package-based Java examples
- `hello.txt` - sample text file used by file handling exercises

## What This Repo Covers

- variables, constants, and data types
- operators, conditions, and ternary logic
- loops, arrays, and nested loops
- methods with and without parameters or return values
- classes, constructors, objects, and scope
- abstraction, encapsulation, inheritance, interfaces, and polymorphism
- enums, exceptions, recursion, and static methods
- collections such as `ArrayList`, `LinkedList`, and `HashMap`
- file creation, reading, writing, and deletion
- package usage with the `Hostel` examples

## Example Files

- `HelloWorld.java` - basic program entry and static block behavior
- `LearnDataTypes.java` - primitive data type practice
- `ArrayListWork.java` - list operations with `ArrayList`
- `HashMapWork.java` - key-value collection practice
- `PolymorphismWork.java` - method overriding examples
- `FileRead.java` - reading from `hello.txt`
- `Main.java` - object creation and package import example
- `Hostel/DateTimeWork.java` - date and time examples from a package

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

Most files are independent learning exercises, so you can run them one at a
time while studying specific Java topics. Build output and IDE files are
already covered by `.gitignore` to keep the repository focused on source code.
