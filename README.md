# JavaCommand

`JavaCommand` is a Java practice repository containing small examples for many
core language topics. It includes programs for variables, loops, methods,
arrays, collections, file handling, object-oriented programming, and packages.

## Project Structure

- `src/` - Java source files
- `src/Hostel/` - package-based examples
- `hello.txt` - sample text file for file-handling exercises

## Topics Covered

- variables and data types
- operators and conditionals
- loops and arrays
- methods and return types
- classes, constructors, and objects
- inheritance, abstraction, encapsulation, and polymorphism
- collections such as `ArrayList`, `LinkedList`, and `HashMap`
- file reading and writing

## Compile And Run

Compile all source files from PowerShell:

```powershell
$files = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d out $files
```

Run one of the example programs:

```powershell
java -cp out HelloWorld
java -cp out Main
```

## Notes

Generated build output and IDE-specific files should stay out of version
control. The `.gitignore` is set up to keep the repository focused on source
code and learning materials.
