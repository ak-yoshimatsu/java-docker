FROM maven:3.9.9-eclipse-temurin-17

# 作業ディレクトリ作成
WORKDIR /app

# pom.xmlとソースをコピー（docker-composeで上書きされる前提）
COPY pom.xml .

COPY src ./src

# 依存解決のみ先に実行（キャッシュ効かせる）
RUN mvn dependency:go-offline

# アプリ起動（ソースコードを監視して再ビルド）
CMD ["mvn", "spring-boot:run"]
