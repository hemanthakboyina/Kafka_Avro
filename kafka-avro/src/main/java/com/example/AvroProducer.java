package com.example;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class AvroProducer {

	public static void main(String[] args) {
		String topic = "order-avro";
		Properties props = new Properties();
		props.put("bootstrap.servers", "192.168.0.101:9092");
		props.put("acks", "all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", StringSerializer.class.getName());
		props.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
		props.setProperty("schema.registry.url", "http://192.168.0.101:8081");

		KafkaProducer<String, Orders> kafkaProducer = new KafkaProducer<String, Orders>(props);

		Orders orders = Orders.newBuilder().setOrderId(1212).setItemName("Laptop").setCustomerId(999)
				.setAddress("Main Road").setQuantity(10).setPaymentStatus(true).build();
		ProducerRecord<String, Orders> producerRecord = new ProducerRecord<String, Orders>(topic, orders.getItemName().toString() ,orders);

		kafkaProducer.send(producerRecord, new Callback() {

			public void onCompletion(RecordMetadata metadata, Exception exception) {
				if (exception == null) {
					System.out.println(metadata.toString());
				} else {
					exception.printStackTrace();
				}
			}
		});
		kafkaProducer.flush();
		kafkaProducer.close();
	}

}
