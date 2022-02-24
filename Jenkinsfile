pipeline{
	agent any
	stages 
	{
		stage('Build') 
		{
			steps{
				echo "Building the Project.........."
				sh 'java -version'
			}
		}
		stage('Compile') 
		{
			steps{
				echo "Compiling the Project.........."
				sh 'javac TiempoActual.java'
			}
		}
		stage('Run') 
		{
			steps{
				echo "Running the Project.........."
				sh 'java TiempoActual'
			}
		}
		stage('Test') 
		{
			steps{
				echo "Testing the Project.........."
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
