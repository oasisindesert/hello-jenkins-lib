
def showStr (String firstName, String lastName) {
  echo "first name: ${firstName}, last name: ${lastName}"
}

def showMap (Map config = [:]) {
  echo "first name: ${config.firstName}, last name: ${config.lastName}"
}
