pipeline {
    agent any
    tools {
        maven 'maven_3.9'
    }
    stages {
        stage("pull") {
            steps {
                git url: 'https://github.com/firmy90/webowa_java_fork.git', branch: 'master'
            }
        }
        stage("build") {
            steps {
                // bat 'mvn clean package'
                sh 'mvn clean package'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/*.war'
            sh 'cp target/webowa.war /opt/wildfly-38.0.1.Final/standalone/deployments/'
            //sh 'cp ./target/webowa.war /home/kurs/wildfly-38.0.1.Final/standalone/deployments/'
            //sh 'cp /var/lib/jenkins/workspace/project05_webowa_java_fork/target/webowa.war /home/kurs/wildfly-38.0.1.Final/standalone/deployments/'
            
        }
    }
}

// the end
