pipeline{
	agent any
	stages 
	{
		stage('Build') 
		{
			steps{
				echo "Building the Project.........."
			}
		}
		stage('Test') 
		{
			steps{
				echo "Testing the Project.........."
				sh 'java -version'
				sh 'javac TiempoActual.java'
			}
		}
		stage('Deploy') 
		{
			steps{
				echo "Deploying the Project.........."
			}
		}
		stage('Release') 
		{
			steps{
				echo "Releasing the Project.........."
			}
		}
	}
}
