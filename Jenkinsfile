pipeline{
    agent any
    tools {
        maven 'Maven' 
    }
    stages{
        stage("Test"){
            steps{
                sh  "mvn test"
                echo "========executing A========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
            
        }
        stage("Build"){
            steps{
                sh  "mvn clean package"
                echo "========executing A========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
            
        }
        stage("Deploy on Test"){
            steps{
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'test_server', path: '', url: 'http://13.203.160.67:8080')], contextPath: '/app', war: '**/*.war'
                echo "========executing A========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
            
        }
        stage("Deploy on Prod"){
            input {
                       message 'Should we continue?'
                  }
            steps{
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'prod_Server', path: '', url: 'http://13.203.209.96:8080')], contextPath: '/app', war: '**/*.war'
                echo "========executing A========"
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========A executed successfully========"
                }
                failure{
                    echo "========A execution failed========"
                }
            }
            
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
