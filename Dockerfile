FROM openjdk:8
COPY ./target/MiniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "MiniCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]