pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/joaogdfaero/Saucedemo_Front_End_Testing.git'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
               bat 'mvn -Dtest=CN01_LoginTest test '
            }
        }
    }
}
