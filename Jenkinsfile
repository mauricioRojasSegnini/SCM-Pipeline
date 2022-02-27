pipeline{
	agent any
	stages 
	{
		stage('Build') 
		{
			steps{
				echo "Building the Project.........."
				sh 'java -version'
				git branch: 'main', url: 'https://github.com/mauricioRojasSegnini/SCM-Pipeline.git'
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
	}
}
