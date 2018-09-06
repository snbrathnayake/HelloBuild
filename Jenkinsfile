pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                 bat '''
                      dir cd src
                      dir
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