def call(String appName) {
  sh "cf stop ${appName}"
}
