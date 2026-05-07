pipeline {
    agent any
    environment{
        name="ajay"
    }
    parameters{
        string(name: ' person', defaultValue: 'Ajay Chauhan', description: 'Who Are You ?')
    }
    stages {
        stage('Multiple') {
            steps {
                sh '''
                uptime
                hostname
                
                '''
            }
        }
        stage("Enviorment variables"){
            environment{
                       user="vijay"
                        }
            steps{
                echo "${name}"
                echo "${user}"
            }
            
        }
        stage('Parameter') {
            steps {
                echo "${person}"
                echo "${name}"
            }
        }
        stage('Continue?') {
            input{
                message "Should we continue"
                ok "Yes we should"
            }
            steps {
                echo "${person}"
                echo "${name}"
            }
        }
    }
    post{
        always{
            echo "I will always say hello again.."
        }
        failure{
            echo "Failure."
        }
        success{
            echo "Success.."
        }
    }
}
