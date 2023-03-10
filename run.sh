#!/bin/bash
set -ue
mvn clean
mvn clean install
mvn compile
mvn test
JDK_JAVA_OPTIONS="--add-opens=java.base/java.net=ALL-UNNAMED" mvn exec:java -Dexec.mainClass="org.gephi.toolkit.save_test.Main" -Dexec.cleanupDaemonThreads=false