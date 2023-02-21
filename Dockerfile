FROM amazoncorretto:8-alpine-jdk
MAINTAINER agustinafw
COPY /target/SBportfolio-0.0.1-SNAPSHOT.jar SBportfolio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SBportfolio-0.0.1-SNAPSHOT.jar"]