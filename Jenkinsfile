pipeline {
    agent any

    tools {
        maven 'maven 3.9.6'
    }

    stages {
        stage("Build") {
            steps {
                git(branch: "${branch}",
                url: "https://github.com/BadSantaClaus/RestAssured_Reqres.git")
            }
        }

        stage("Test") {
            steps {
                sh "mvn clean test -Dtest=#${test}"
            }
            post {
                always {
                    allure includeProperties: false,
                     jdk: '',
                     results: [[path: 'target/allure-results']]
                }
            }
        }
    }
}