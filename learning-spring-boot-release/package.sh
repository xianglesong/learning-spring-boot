#!/usr/bin/env bash

echo `pwd`

echo "mvn begin"
mvn -P package $@ clean package spring-boot:repackage assembly:assembly -DskipTests

echo "mvn end"
