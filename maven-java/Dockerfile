FROM maven

# 作業ディレクトリを設定
WORKDIR /app

# # pom.xmlとソースコードをコピー
# COPY pom.xml .
# COPY src ./src

# # 依存関係をダウンロード
# RUN mvn dependency:go-offline

# # アプリケーションをビルド
# RUN mvn clean package -DskipTests

# # 実行用のイメージを作成
# FROM openjdk:17-jdk-slim

# # JARファイルをコピー
# COPY --from=build /app/target/*.jar app.jar

# # アプリケーションを実行
# ENTRYPOINT ["java", "-jar", "/app.jar"]


# ビルド
# docker build -t maven-java-app .

# コンテナ実行
# docker run -it --rm -v `pwd`:/app maven-java-app bash
