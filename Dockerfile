FROM openjdk:15
COPY ./target/miniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "miniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "miniCalculator"]
