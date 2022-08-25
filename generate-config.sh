JAVA_HOME=$HOME/prg/graalvm-ce-java11-22.2.0/
$JAVA_HOME/bin/java -agentlib:native-image-agent=config-output-dir=src/test/resources/config -jar target/mesh-all.jar