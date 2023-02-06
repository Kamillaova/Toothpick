plugins {
  `kotlin-dsl`
}

group = "xyz.jpenilla"
version = "1.1.0-SNAPSHOT"
description = "Gradle plugin to assist in forking Paper"

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation(libs.bundles.jackson)
  implementation(libs.bundles.configurate)
  implementation(libs.shadow)
}

kotlin {
  explicitApi()
}

tasks {
  jar {
    manifest {
      attributes("Implementation-Version" to project.version)
    }
  }
  compileKotlin {
    kotlinOptions.apiVersion = "1.4"
    kotlinOptions.jvmTarget = "1.8"
  }
}
