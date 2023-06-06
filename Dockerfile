FROM amazoncorretto:11

COPY target/porfolio-0.0.1-SNAPSHOT.jar porfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/porfolio-0.0.1-SNAPSHOT.jar"]
