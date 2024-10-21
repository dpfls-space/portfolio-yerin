FROM openjdk:17

LABEL maintainer="38265ye@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/yerin-portfolio-ver1.jar

ADD ${JAR_FILE} yerin-portfolio-ver1.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/yerin-portfolio-ver1.jar"]