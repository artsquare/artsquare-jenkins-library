def call(String appName, String filespec) {
  sh "cf p ${appName} -p ${filespec}"
}
