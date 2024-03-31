pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "rumirea.Kirillova.Lesson3"
include(":app")
include(":intentapp")
include(":sharer")
include(":favouritebook")
include(":systemintentsapp")
include(":simplefragmentapp")
