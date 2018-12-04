@Library("test-runner-lab") _
import com.mnt_lab.*

def testRunner = new tests()
node("$SLAVE") {
	stage('Checkout') {
		git branch:scm.branches[0].name,  url: 'https://github.com/MNT-Lab/groovy-tasks.git'
	}
	testRunner.exec()
}
