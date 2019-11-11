package com.mq.demo;

import com.mq.dao.User;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Productor {

    private static KafkaProducer<String, Object> producer;
    private final static String TOPIC = "testDemo";
    public Productor(){
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //设置分区类,根据key进行数据分区
        producer = new KafkaProducer<String, Object>(props);
    }
    public void produce(String key,String value){
        producer.send(new ProducerRecord<String, Object>(TOPIC,key,value));
//        producer.close();
    }



    public static void main(String[] args) {
        new Productor().produce("1","aaa");
    }
}
