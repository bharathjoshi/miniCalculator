FROM openjdk:15
COPY ./target/miniCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "miniCalculator1-1.0-SNAPSHOT.jar", "miniCalculator"]
ENTRYPOINT [ "/bin/bash", "-l", "-c" ]
