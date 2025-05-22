FROM amazoncorretto:17
# RUN echo $' \
# public class Hello { \
# public static void main(String[] args) { \
# System.out.println("Welcome to Amazon Corretto!"); \
# } \
# }' > Hello.java
# RUN javac Hello.java
# CMD ["java", "Hello"]
# RUN apt-get update && apt-get install -y tar


WORKDIR /app

# ビルド：docker build -t hello-app .
# 実行：docker run -it -v `pwd`:/app hello-app bash

# コンパイル：java Hello.java → Hello.classが生成される
# 実行：java Hello