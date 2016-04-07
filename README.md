Dropwizard seed project
=======================

A basic Java REST service created with DropWizard. Run fat JAR with:

```
mvn clean package

java -jar target/dropwizard-seed-1.0-SNAPSHOT.jar server src/main/java/project/config/envConfig.yml
```

View result on [localhost:8080/app/local?search=1](localhost:8080/app/local?search=1)