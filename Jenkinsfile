@Library('batch15-shared-library') _ // Loads the library configured in Jenkins

pipeline {
    agent any
    stages {
        stage('Example Shared Step') {
            steps {
                sayHello('Adarsh from batch 15') // Call the function defined in vars/sayHello.groovy
            }
        }
    }
}
