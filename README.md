# Patterns examples

## Introduction

Various patterns for object-oriented programming.


## Setup

### Installing Java SDK

This project aims to be compatible with the latest JDK versions; to get it:

-   Windows:
    -   `choco install -y openjdk` for the latest JDK
-   Linux (Debian/Ubuntu):
    -   `apt install -y default-jdk` for the distro's default JDK
    -   `apt install -y openjdk-16-jdk` for an explicit JDK

To verify your installation:

-   check the compiler: `javac -version`
-   check the application launcher: `java -version`
-   check the archive tool: `jar --version`


### Installing an IDE

You can use either Eclipse or a compatible setup, for example:

-   [Eclipse](https://www.eclipse.org/downloads/packages/)
-   [VS Code + Java Extension Pack](https://code.visualstudio.com/docs/languages/java)


### Preparing the project files

To easily create a project for Eclipse or any other compatible IDE, copy the files from
`tools/ide/eclipse` into the project root (next to this file). This will copy the necessary
configuration into the project directory. Once you have done that, you will be able to import
the project into your IDE. For example:

-   for Eclipse: `Import > General > Import Existing Project into Workspace`
-   for VS Code: `File > Open Folder...`


## Running

### Using the solutions

To run the solutions, replace the contents of the `src` folder with the contents of the `src-solutions` folder.
