# Build
mvn clean package && docker build -t com.mycompany/pw-Leone .

# RUN

docker rm -f pw-Leone || true && docker run -d -p 8080:8080 -p 4848:4848 --name pw-Leone com.mycompany/pw-Leone 