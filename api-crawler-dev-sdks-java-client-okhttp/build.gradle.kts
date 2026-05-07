plugins {
    id("api-crawler-dev-sdks.kotlin")
    id("api-crawler-dev-sdks.publish")
}

dependencies {
    api(project(":api-crawler-dev-sdks-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.2")
}
