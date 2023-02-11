# [Demo MapStruct](https://mapstruct.org/)

### What is it?

MapStruct is an open-source Java-based code generator based on a convention over configuration approach which creates
code for mapping implementations.

It uses annotation-processing to generate mapper class implementations during compilation and greatly reduces the amount
of boilerplate code which would regularly be written by hand.

**With MapStruct, we only need to create the interface, and the library will automatically create a concrete
implementation during compile time.**

### Maven dependency

```xml

<dependencies>
    <dependency>
        <groupId>org.mapstruct</groupId>
        <artifactId>mapstruct</artifactId>
        <version>${org.mapstruct.version}</version>
    </dependency>
</dependencies>
```

You can find latest version of MapStruct
here : [MapStruct maven repository](https://mvnrepository.com/artifact/org.mapstruct/mapstruct)

This dependency will import the core MapStruct annotations in your project. Since MapStruct works on **compile-time**
and is attached to builders like Maven and Gradle, you'll also have to add a plugin to the **build** section of your *
*pom.xml** file :

```xml

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.5.1</version>
    <configuration>
        <source>1.8</source>
        <target>1.8</target>
        <annotationProcessorPaths>
            <path>
                <groupId>org.mapstruct</groupId>
                <artifactId>mapstruct-processor</artifactId>
                <version>${org.mapstruct.version}</version>
            </path>
        </annotationProcessorPaths>
    </configuration>
</plugin>
```
