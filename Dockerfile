FROM amazoncorretto:17-alpine
# 빌드 시 생성된 jar 파일을 컨테이너 안으로 복사
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
# 보안: 루트 권한이 아닌 별도 유저로 실행 (선택 사항이나 권장)
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/app.jar"]