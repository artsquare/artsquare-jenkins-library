def call(String buildId = "${BUILD_ID}") {
  "${dateAsVersion()}-${BUILD_ID}"
}
