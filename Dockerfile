# Usar a imagem base do Maven para compilar a aplicação
FROM openjdk:17-oracle

RUN mkdir app

COPY target/mongo-ex1-1.0-SNAPSHOT.jar /app/app.jar

# Diretório de trabalho dentro do container
WORKDIR /app

# Comando para rodar a aplicação
ENTRYPOINT java -jar app.jar
