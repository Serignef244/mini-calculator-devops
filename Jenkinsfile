pipeline {
    agent any

    // Déclaration des outils globaux (Maven et JDK)
    tools {
        maven 'Maven'      // Nom exact configuré dans Jenkins Global Tool Configuration
        jdk 'JDK17'        // Nom exact du JDK configuré dans Jenkins
    }

    environment {
        // Nom du serveur SonarQube configuré dans Jenkins
        SONARQUBE = 'SonarQube'
    }

    stages {

        stage('Checkout') {
            steps {
                echo '🔄 Checkout du code depuis GitHub'
                git branch: 'master', 
                    url: 'https://github.com/Serignef244/mini-calculator-devops.git'
            }
        }

        stage('Build & Test') {
            steps {
                echo '🔧 Compilation du projet et exécution des tests unitaires'
                sh 'mvn clean test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                echo '🔍 Analyse de la qualité du code avec SonarQube'
                withSonarQubeEnv(SONARQUBE) {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Nexus') {
            steps {
                echo '📦 Déploiement des artefacts Maven sur Nexus'
                sh 'mvn deploy'
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline terminé avec succès !'
        }
        failure {
            echo '❌ Pipeline échoué. Vérifier la console pour plus d\'informations.'
        }
    }
}
