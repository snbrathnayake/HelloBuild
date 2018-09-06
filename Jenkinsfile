pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'make check || true' 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}