@Library('batch15-shared-library') _ // Loads the library configured in Jenkins

pipeline {
    agent any
    stages {
        stage('Example Shared Step') {
            steps {
                sayHello('Newman') // Call the function defined in vars/sayHello.groovy
            }
        }
    }
}
