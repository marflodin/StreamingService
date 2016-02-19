dirFROM java:8-jre

COPY streaming-service.yml /opt/dropwizard/
COPY target/streaming-service-0.0.1-SNAPSHOT.jar /opt/dropwizard/

EXPOSE 9000
EXPOSE 9001

WORKDIR /opt/dropwizard

CMD ["java", "-jar", "-Done-jar.silent=true", "streaming-service-0.0.1-SNAPSHOT.jar", "server", "streaming-service.yml"]