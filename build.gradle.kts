// 定义插件
plugins {
    java
    kotlin("jvm") version "1.3.60"
}

group = "org.example"
version = "1.0-SNAPSHOT"



val springVersion by extra("5.2.1.RELEASE")
if (System.getProperty("profile") == "product") {
    val releaseVersion by extra("")
} else {
    val releaseVersion by extra("SNAPSHOT")
}

// 定义仓库
repositories {
    maven("http://maven.aliyun.com/nexus/content/repositories/jcenter")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("log4j", "log4j", "1.2.17")
    implementation("org.springframework", "spring-context", springVersion)
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    // 修改task.jar
    jar {
        archiveBaseName.set("first-gradle")
        archiveVersion.set("0.1.0")
        archiveClassifier.set(ext.get("releaseVersion").toString())
        archiveExtension.set("jar")
        manifest {
            attributes (
                "Implementation-Title" to archiveBaseName,
                "Implementation-Version" to archiveVersion
            )
        }
    }
    register("hello") {
        doLast {
            println("nihao")
        }
    }

    register("upper") {
        doLast {
            val someString = "sunxu"
            println("Original: $someString")
            println("Upper case: ${someString.toUpperCase()}")
        }
    }

    register("getProperties") {
        doLast {
            println(System.getProperties())
        }
    }

    register("count") {
        dependsOn("hello")
        doLast {
            repeat(4) {
                print("$it ")
            }
        }
    }
}
