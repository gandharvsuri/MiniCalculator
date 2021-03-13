FROM openjdk:8
COPY ./target/ScientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "MiniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]