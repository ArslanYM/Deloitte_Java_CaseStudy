version: '3.8'
services:
  prometheus:
    image: prom/prometheus:latest
    container_name: prometheus
    ports:
      - "9090:9090"
    volumes:
      - ./prometheus.yml:/etc/prometheus/prometheus.yml
    depends_on:
      - fraud-service
      - transaction-service
      - kafka

  grafana:
    build: ./grafana
    container_name: grafana
    ports:
      - "3000:3000"
    depends_on:
      - prometheus
