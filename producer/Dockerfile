FROM openjdk:17

# указываем docker контейнеру, по какому порту будет работать приложение,
# чтобы этот порт был доступен для маппинга
EXPOSE 9955

# компируем в контейнер jar со всеми исходниками и библиотеками внутри него
ADD build/libs/producer-0.0.1-SNAPSHOT.jar /app/ice-test-producer.jar
ENTRYPOINT ["java", "-jar", "/app/ice-test-producer.jar"]
