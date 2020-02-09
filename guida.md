### RESTFUL WEB SERVICE
RestFul netbeans tutorial (with db): https://netbeans.org/kb/docs/websvc/rest.html

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

#### INSTALL RABBIMQ SERVER
https://www.fosslinux.com/6339/how-to-install-rabbitmq-server-on-ubuntu-18-04-lts.htm
