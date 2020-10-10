#!/bin/bash
nohup java -jar ~/springbootapps/SpringBootEc2CodeDeployDemo/jars/SpringBootEc2CodeDeployDemo-0.0.1-SNAPSHOT.jar > ~/springbootapps/SpringBootEc2CodeDeployDemo/logs/SpringBootEc2CodeDeployDemo.txt 2>&1 &
echo $! > ~/springbootapps/SpringBootEc2CodeDeployDemo/pid/pid.file