ARG BUILD_VERSION=1
FROM eclipse-temurin:17-jdk
ADD build/libs/curryware-java-${BUILD_VERSION}.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

# ./gradlew build
# docker build -t curryware-java:1 .
# docker run --name curryware-java -p 8084:8080 curryware-java:1
