
def showStr (String firstName, String lastName) {
  sh 'echo "first name: ${firstName}, last name: ${lastName}"'
}

def showMap (Map config = [:]) {
  sh 'echo " first name: ${config.firstName}, last name: ${config.lastName}"'
}
