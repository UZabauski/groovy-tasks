@Library("test-runner-lab") _
import com.mnt_lab.*

def testRunner = new tests()
node("$SLAVE") {
	stage('Checkout') {
		git branch:BRANCH_NAME,  url: 'https://github.com/MNT-Lab/groovy-tasks.git'
	}
	testRunner.exec()
}
