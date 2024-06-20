# Usa una imagen base oficial de OpenJDK para JDK 21
FROM eclipse-temurin:21-jdk-jammy

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo pom.xml y el archivo de configuración de Maven
COPY pom.xml .

# Copia los archivos de dependencia y los plugins necesarios para el build
COPY mvnw .
COPY .mvn .mvn

# Cambia los permisos del script mvnw para hacerlo ejecutable
RUN chmod +x mvnw

# Descarga las dependencias necesarias para la compilación
RUN ./mvnw dependency:go-offline

# Copia el resto del código de la aplicación al contenedor
COPY src ./src

# Compila la aplicación
RUN ./mvnw package -DskipTests

# Expone el puerto en el que tu aplicación estará escuchando
EXPOSE 8080

# Define el comando que se ejecutará cuando el contenedor se inicie
CMD ["java", "-jar", "target/citas-0.0.1-SNAPSHOT.jar"]
