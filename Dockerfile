# Utilise une image OpenJDK 17 légère
FROM openjdk:17-jdk-slim

# Définit le répertoire de travail
WORKDIR /app

# Copie le JAR généré par Maven
COPY target/mini-calculator-devops-1.0-SNAPSHOT.jar app.jar

# Point d'entrée pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]