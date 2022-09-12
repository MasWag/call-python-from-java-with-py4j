call-python-from-java-with-py4j
===============================

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](./LICENSE)

An example to implement a Java interface with python

Requirements
------------

- Java
- Maven
- Python 3

Files
-----

- `java/`
    - `pom.xml`: Configuration file of Maven
    - `src/main/java/py4j/examples/`
        - `Animal.java`: The Java file defining `Animal` interface.
        - `CallPythonFromJava.java`: The entorypoint of the Java part
- `python/`
    - `requirements.txt`: Defining the dependent packages
    - `examples/`
        - `dog.py`: The Python file defining `Dog` class implementing `Animal` interface defined in Java
        - `main.py`: The entorypoint of the Java part

Usage
-----

The Java part and the python part must be run simultaneously, e.g., using a different terminal window.

### Configure and run the Python part

#### Make venv

``` sh
cd python
python3 -m venv .venv 
. .venv/bin/activate # bash
# . .venv/bin/activate.fish # fish
# . .venv/bin/activate.csh # csh
```

#### Install the dependent packages

``` sh
pip install -r requirements.txt 
```

#### Run the script

The following part has to be executed "before" running the Java part. The following command blocks the terminal to wait for the communication from the Java part using py4j.

``` sh
python ./examples/main.py
```

### Configure the Java part

#### Compile the Java part 

``` sh
cd java
mvn package
```

#### Run the Java part

By running the following command, it should show `ruff ruff`, which is implemented in the `Dog` class in Python.

``` sh
java -jar ./target/py4j-example-1.0-SNAPSHOT.jar
```

