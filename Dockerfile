FROM openjdk:8-jdk-alpine
COPY build/libs/GpsUtil-0.0.1-SNAPSHOT.jar GpsUtil-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/GpsUtil-0.0.1-SNAPSHOT.jar"]
