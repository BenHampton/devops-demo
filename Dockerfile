FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

# ARG GIT_COMMIT=unspecified
# LABEL git_commit=$GIT_COMMIT

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
