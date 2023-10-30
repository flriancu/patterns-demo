# Patterns examples

## Introduction

Various patterns for object-oriented programming.


## Setup

### Installing requirements

This project aims to be compatible with the latest JDK versions.

To get the requirements, follow these steps:

-   install a Java Development Kit: [there are many](https://whichjdk.com/), and the best one at the moment is [Eclipse Temurin](https://adoptium.net/installation/)
-   install [Maven](https://maven.apache.org/)

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
`tools/ide/eclipse` into the project root (next to this `README` file). This will copy the
necessary configuration into the project directory. Once you have done that, you will be able
to import the project into your IDE. For example:

-   for Eclipse: `Import > General > Import Existing Project into Workspace`
-   for VS Code: `File > Open Folder...`


## Running

Each particular pattern (iterator, observer, etc.) is a self-contained project, with their own `main` function.


### Using the solutions

To run the solutions, replace the contents of the `src` folder with the contents of the `src-solutions` folder.
