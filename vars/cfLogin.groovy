def call(String space, String username = "${CF_CRED_USR}", String password = "${CF_CRED_PSW}", String org = "${CF_ORG}", String api='https://api.ng.bluemix.net') {
  sh "cf login -a '${api}' -u '${username}' -p '${password}' -o '${org}' -s '${space}'"
}
