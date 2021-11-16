FROM openjdk:16-alpine3.13
COPY MySort.java /usr/src/
WORKDIR /usr/src/
RUN javac MySort.java
CMD ["java", "MySort"]
