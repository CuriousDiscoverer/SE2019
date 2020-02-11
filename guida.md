############### LINK MY DRIVE

https://drive.google.com/drive/folders/151ioCWVgYQlB4kbL9WTNWDDlC1_5YIA4?usp=sharing

############### GITHUB GRUPPO

https://github.com/marcocosta96/SoftwareEngineeringLab
#### LINK GUIDA

https://github.com/marcocosta96/SoftwareEngineeringLab/blob/master/Dispensa%20operativa.txt


############### LABORATORI

https://github.com/marcocosta96/SoftwareEngineeringLab/tree/master/Labs
https://github.com/nicoDs96/SE-LABs


############### ESAMI SVOLTI

#### SOAP + DB + (xml??)
https://github.com/aserpi/msecs-1-se/tree/master/2019-07
https://github.com/nicoDs96/exam (I not like this, is the same of previus but.. not better)

#### SOAP + JMS
https://github.com/aserpi/msecs-1-se/tree/master/2019-06

#### JMS + DB
https://github.com/aserpi/msecs-1-se/tree/master/2019-09




#### REST + DB (maybe not complete)
https://github.com/FedericaSole/RestfulConDB



################ USEFUL
#### RESTFUL WEB SERVICE
RestFul netbeans tutorial (with db): https://netbeans.org/kb/docs/websvc/rest.html






############# MAVEN HTTPS FIX

If error in pom file.. maybe is error 501 (https required)
=> Put this code in pom.xml, at the end (https://stackoverflow.com/a/59781316)

    <pluginRepositories>
        <pluginRepository>
            <id>central</id>
            <name>Central Repository</name>
            <url>https://repo.maven.apache.org/maven2</url>
            <layout>default</layout>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
            <releases>
                <updatePolicy>never</updatePolicy>
            </releases>
        </pluginRepository>
    </pluginRepositories>
    <repositories>
        <repository>
            <id>central</id>
            <name>Central Repository</name>
            <url>https://repo.maven.apache.org/maven2</url>
            <layout>default</layout>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>





######### RabbitMQ 

https://activemq.apache.org/getting-started.html#InstallationProcedureforUnix

######### ActiveMQ
https://activemq.apache.org/getting-started.html#InstallationProcedureforUnix

deve esser fatto partire il broker.. qualcosa tipo: 

./activemq console

poi

./activemq start
