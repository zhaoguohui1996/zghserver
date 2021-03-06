import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.0-SNAPSHOT"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.4.21-2"
    kotlin("plugin.spring") version "1.4.30-RC"
}

group = "com.zgh.server"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_15

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.4.2")
    implementation("p6spy:p6spy:3.9.1")
    implementation("com.github.xiaoymin:knife4j-spring-boot-starter:3.0.2")
    implementation("org.springframework.data:spring-data-redis:2.4.3")
    implementation("org.projectlombok:lombok:1.18.18")
    implementation("org.springframework.boot:spring-boot-starter-web:2.4.2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.1")
    implementation("io.netty:netty-all:4.1.58.Final")
    implementation("org.springframework.boot:spring-boot-starter-security:2.4.2")
    implementation("mysql:mysql-connector-java:8.0.23")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "15"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
