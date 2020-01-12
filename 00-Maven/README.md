# First pass to do with Maven

First of all: create a folder.
Open terminal in this folder.

## Generating a simple Java project:

Use the following code to generate a simple Java project:

```
mvn archetype:generate
```
If asked insert 630 (default, if not asket.. better)
Then insert these value manually, when required:

```
  -DgroupId=it.mycompanyname
  -DartifactId=it.mycompanyname.java 
  -DarchetypeArtifactId=maven-archetype-quickstart
  -DinteractiveMode=false
```
