# 1단계: 빌드 스테이지 (선택사항 - 멀티스테이지)
FROM gradle:8.4-jdk17 AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle build -x test

# 2단계: 실제 실행 이미지
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# JAR 복사
COPY --from=build /app/build/libs/*.jar app.jar

# 포트 오픈
EXPOSE 8080

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

