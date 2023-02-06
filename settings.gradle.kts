enableFeaturePreview("VERSION_CATALOGS")

includeBuild("shadow") {
  dependencySubstitution {
    substitute(module("dev.kamillaova:shadow")).using(project(":"))
  }
}

plugins {
  id("ca.stellardrift.polyglot-version-catalogs") version "5.0.0"
}

rootProject.name = "toothpick"
