def call() {
    withSonarQubeEnv(credendialsId: credendialsId) {
        sh "mvn clean package soanr:sonar"
    }
}