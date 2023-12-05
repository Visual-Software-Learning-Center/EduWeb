# Hello World! 
This project is an educational portal for teaching high school students on how to code.

### Getting started
#### pre-req: 

- Java 21
- Maven

```
mvn clean package
```
This will create a `target` folder and bundle your source code into a jar file for execution.

we can then `cd` into our target directory on the command line and execute our application: 
```
cd target
java -jar api-<VERSION>-SNAPSHOT.jar 
(example: java -jar api-0.0.1-SNAPSHOT.jar)
```
