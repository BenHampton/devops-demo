FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/devops-0.0.1-SNAPSHOT.jar.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/app.jar"]