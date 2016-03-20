#OWLAPI Example

This project provides a simple example of a Java application that uses the [OWLAPI](https://github.com/owlcs/owlapi).

You can import this project into your favourite IDE using its Maven-based project creation facility.

### Building

To build and run this project you must have the following items installed:

+ [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ A tool for checking out a [Git](http://git-scm.com/) repository
+ Apache's [Maven](http://maven.apache.org/index.html)

Get a copy of the latest code:

    git clone https://github.com/zippyrate/owlapi-exp.git 

Change into the owlapi-exp directory:

    cd owlapi-exp

Build it with Maven:

    mvn clean install

On build completion, your local Maven repository will contain generated owlapi-exp-${version}.jar and owlapi-exo-${version}-jar-with-dependencies.jar files.
The ./target directory will also contain these JARs.

You can then run the application as follows:

    mvn exec:java
