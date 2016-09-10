# sparkjava-hello
A Hello World running in Spark Java

See: http://pconrad-webapps.github.io/topics/spark_java_getting_started/

To compile and build executable uberjar:

```
mvn package
```

To run from executable uberjar:

```
java -jar target/HelloSparkJava-1.0-SNAPSHOT.jar 
```

That starts a server running on port 4567

Go to: http://localhost:4567/hello to see result.

Substitute hostname for localhost if you can't run a web browser directly on the machine
where you are running.

