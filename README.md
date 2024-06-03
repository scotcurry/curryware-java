# Overview

REST API service.  At this point doesn't do anything, will get fleshed out in the future.

## Interesting points

* Pass the version in with the gradlew build command.  Going to need this with the build
```
./gradlew -PprojVersion=0.23.6 build
```
This goes with the code in the build.gradle file.
```
if (project.hasProperty('projVersion')) {
    project.version = project.projVersion
} else {
    project.version = '1.2.3'
}
```

## Running the app from the IDE
```
./gradlew bootRun
```

## Logging Configuration
Spring uses logback by default.  Set options in the /src/main/resources/logback-spring.xml file.
