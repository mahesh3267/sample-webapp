# sample-webapp

# Pre-requisites:

openjdk8 

# Build Project 

**Maven:** 

Windows:
```
./mvnw.bat clean package
```
Linux:
```
./mvnw clean package
```
**Gradle:**

Windows:
```
./gradlew.bat clean build
```
Linux:
```
./gradlew clean build
```

# Build Docker Image 

**GRADLE**
```
docker build -t sample-app .
```

**MAVEN**

```
docker build -f Dockerfile_Maven -t sample-app .
```

# Run the Docker Container

```
docker run -d -p 8080:8080 sample-app:latest
```

# Check the Running containers in Server

```
docker ps -a
```

# Stop all the containers from system 

```
docker stop $(docker ps -aq)
```

# Remove all the stopped containers

```
docker rm $(docker ps -aq)
```
