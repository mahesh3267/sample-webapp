pipeline {
   agent any
   
   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
            git 'https://github.com/mahesh3267/sample-webapp.git'

            // Execute Gradle build.
            sh "chmod +x ./gradlew && ./gradlew clean build"
			
            
         }

         post {
            success {
               junit '**/build/test-results/test/*.xml'
               archiveArtifacts 'build/libs/*.war'
            }
         }
      }
      stage('build_docker_image') {
        steps {
			sh "docker build -t mahesh3267/sample-webapp:$BUILD_NUMBER ."
		}
      }
	  stage('push_docker_image') {
        steps {
			sh "docker push mahesh3267/sample-webapp:$BUILD_NUMBER"
		}
      }
   }
}

