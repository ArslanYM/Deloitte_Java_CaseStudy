kafka-topics.sh --create \
  --topic transaction-topic \
  --bootstrap-server localhost:9092 \
  --partitions 1 \
  --replication-factor 1

kafka-topics.sh --create \
  --topic fraud-alert-topic \
  --bootstrap-server localhost:9092 \
  --partitions 1 \
  --replication-factor 1
