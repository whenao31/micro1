FROM openjdk:8
ADD target/demo-0.0.1-snapshot.jar demo-0.0.1-snapshot.jar
ENTRYPOINT ["java", "-jar","demo-0.0.1-snapshot.jar"]