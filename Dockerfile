FROM alpine
MAINTAINER rnd.mate00
RUN apk add openjdk11
# better not run as root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY build/libs/containerized-spring-app-0.0.1-SNAPSHOT.jar /opt/
CMD ["/usr/bin/java", "-jar", "/opt/containerized-spring-app-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081

# build this with:
# docker build --tag alpine-openjdk11 .
# docker run --name=alpinejava --publish=8081:8081 alpine-openjdk11
# docker run --rm -it alpine-openjdk11 /bin/ash # temporairly enter shell and remove container upon exit