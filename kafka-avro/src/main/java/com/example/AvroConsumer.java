package com.example;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;

public class AvroConsumer {

	public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("bootstrap.servers","192.168.0.101:9092");
        props.put("group.id", "order-consumer-group-v2");
        props.put("auto.commit.enable", "false");
        props.put("auto.offset.reset", "earliest");

        props.setProperty("key.deserializer", StringDeserializer.class.getName());
        props.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
        props.setProperty("schema.registry.url", "http://192.168.0.101:8081");
        props.setProperty("specific.avro.reader", "true");

        KafkaConsumer<String, Orders > kafkaConsumer = new KafkaConsumer<>(props);
        String topic = "order-avro";
        kafkaConsumer.subscribe(Collections.singleton(topic));

        while (true){
            System.out.println("Polling");
            ConsumerRecords<String, Orders> records = kafkaConsumer.poll(1000);

            for (ConsumerRecord<String, Orders> record : records){
                Orders order = record.value();
                System.out.println(order);
            }

            kafkaConsumer.commitSync();
        }
    
	}
}
