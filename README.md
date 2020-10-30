# canal+kafka 

#### 介绍
canal+kafka+binlog 实现数据实时同步
仅实现canal消息读取和kafka订阅

如使用canal自带推送到kafka配置


    编辑instance.properties文件:
    canal.mq.topic=sqltest
    # dynamic topic route by schema or table regex
    #canal.mq.dynamicTopic=mytest1.user,mytest2\\..*,.*\\..*
    canal.mq.partition=0
    
    canal.properies文件
    kafka.bootstrap.servers = 127.0.0.1:9092
    kafka.acks = all
    kafka.compression.type = none
    kafka.batch.size = 16384
    kafka.linger.ms = 1
    kafka.max.request.size = 1048576
    kafka.buffer.memory = 33554432
    kafka.max.in.flight.requests.per.connection = 1
    kafka.retries = 0
    
参考<https://github.com/alibaba/canal/>