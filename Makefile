build:
	mvn clean package

docker-build: build
	docker build -t ghcr.io/solo157/myapp:latest .

docker-push: docker-build
	docker push ghcr.io/solo157/myapp:latest

all: docker-push
