plugins {
  `kotlin-dsl`
}

group = "dev.kamillaova"
version = "FUCKING"
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

gradlePlugin {
  plugins {
    create("Toothpick") {
      id = "dev.kamillaova.toothpick"
      implementationClass = "xyz.jpenilla.toothpick.Toothpick"
    }
  }
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
