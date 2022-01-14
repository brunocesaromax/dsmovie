FROM openjdk:17-jdk-slim
VOLUME /tmp
ADD target/dsmovie-0.0.1-SNAPSHOT.jar dsmovie.jar
EXPOSE 8080
RUN bash -c 'touch /dsmovie.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/dsmovie.jar"]