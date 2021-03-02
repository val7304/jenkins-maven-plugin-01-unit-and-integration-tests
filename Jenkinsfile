pipeline{
    agent any
    
    tools {
        maven 'my-maven-3' 
    }    
    stages{
	//    stage ('Clone') {
    //         steps {
    //             git branch: 'master', url: "https://github.com/val7304/jenkins-maven-plugin-01-unit-and-integration-tests.git"
    //         }
	//     }
	 
	   stage('Build & Unit test'){
		  steps {
				sh 'mvn clean verify -DskipITs=true';
		      	junit '**/target/surefire-reports/TEST-*.xml'
		      	archiveArtifacts  'target/*.jar'

	      }
   	  }
	
	  stage ('Integration Test'){
	      steps {
    			sh  'mvn clean verify -Dsurefire.skip=true';
				junit '**/target/failsafe-reports/TEST-*.xml'
      			archiveArtifacts  'target/*.jar'
      		}
      }	
    }
}