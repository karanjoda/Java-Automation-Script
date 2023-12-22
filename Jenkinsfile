pipeline {
    agent any

    environment {
        PWDD = sh(script: 'pwd', returnStdout: true).trim()
        SONAR_PROJECT_KEY = 'Testing'
        SONAR_HOST_URL = 'http://172.31.11.103:9000'
        SONAR_TOKEN = 'sqp_8217559e9719075a36d7d610a54690bbc19543f1'
    }

    stages {
        stage('Print Working Directory and List Contents') {
            steps {
                script {
                    // Print the current working directory
                    echo "Current working directory: ${PWDD}"

                    // List the contents of the directory
                    sh 'ls -la'
                }
            }
        }

        stage('Sonar Analysis') {
            steps {
                script {
                    // Running the scanner using Docker
                    sh "docker run \
                        --rm \
                        -e SONAR_HOST_URL=${SONAR_HOST_URL} \
                        -e SONAR_SCANNER_OPTS='-Dsonar.projectKey=${SONAR_PROJECT_KEY}' \
                        -e SONAR_TOKEN=${SONAR_TOKEN} \
                        -v '${PWDD}:/usr/src' \
                        sonarsource/sonar-scanner-cli -X"
                }
            }
        }
    }
}
