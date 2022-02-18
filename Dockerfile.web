#Primer container para maven
FROM maven:3-jdk-11

#Creamos Workspace
ADD . /demo2
WORKDIR /demo2

# Run Maven build
RUN mvn clean install

#Segundo container para la app
FROM openjdk:11-jdk
VOLUME /tmp

# Añadimos el container
COPY --from=0 "/demo2/target/demo2-*-SNAPSHOT.jar" demo2.jar

#Lanzamos run con configuracion de puertos y de memoria para java
CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -jar /demo2.jar" ]
