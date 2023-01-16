FROM amazoncorretto:11-alpine-jdk
MAINTAINER EJS
COPY target/PortfolioWeb-0.0.1-SNAPSHOT.jar back-AP
ENTRYPOINT["java","-jar","/back-AP"]