zookeeper : /usr/local/zookeeper-3.4.6/bin/zkServer.sh start

/usr/bin/fdfs_trackerd /etc/fdfs/tracker.conf restart
/usr/bin/fdfs_storaged /etc/fdfs/storage.conf restart

solr tomcat : /usr/local/solr/tomcat/bin/startup.sh

ActiveMQ : /usr/local/apache-activemq-5.12.0/bin/linux-x86-32/activemq start