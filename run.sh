#!/bin/bash

chmod 777 $0

java=$(which java11)

GDK_SCALE=2 $java -jar target/mesh-all.jar 