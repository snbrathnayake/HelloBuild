pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 bat '''
                      bat 'dir cd src'
                      bat 'dir'
                 '''
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