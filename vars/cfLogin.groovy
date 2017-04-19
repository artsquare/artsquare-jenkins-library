def call(String username, String password, String org, String space, String api='https://api.ng.bluemix.net') {
  sh "cf login -a '${api}' -u '${username}' -p '${password}' -o '${org}' -s '${space}'"
}
