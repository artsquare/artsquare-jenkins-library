def call(String appName, String filespec, String smokeTest = './deploy/smoke-test') {
  sh "./deploy/cf-blue-green ${appName} ${smokeTest} ${filespec}"
}
