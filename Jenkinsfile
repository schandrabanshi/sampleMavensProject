pipeline{
  agent any
  environment{
    notifyEmail="saroj.chandrabanshi@nagarro.com"
  }
  tools{
    maven 'Maven'
  }
  stages{
    stage("Code checkout"){
      steps{
        bat "echo checking out the code from git."
      }
    }
    stage("code build"){
      steps{
        bat "mvn clean"
      }
    }
    stage("test runs"){
      steps{
        bat "mvn test"
      }
    }
    
  }
}
