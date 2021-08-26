plugins {
    id("java")
    id("org.openrewrite.rewrite") version "latest.release"
}

repositories {
    mavenCentral()
}

// Rewire Config
rewrite {
    activeRecipe("org.openrewrite.kubernetes.KubernetesBestPractices")
    failOnDryRunResults = true // fail if changes will occur
}

dependencies {
    // Enable Rewire
    rewrite("org.openrewrite.recipe:rewrite-kubernetes:1.5.0")
}
