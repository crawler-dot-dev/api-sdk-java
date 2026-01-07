plugins {
    id("api-crawler-dev-sdks.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api-crawler-dev-sdks-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :api-crawler-dev-sdks-java-example:run` to run `Main`
    // Use `./gradlew :api-crawler-dev-sdks-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.configure_me_apicrawlerdev_sdks.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
