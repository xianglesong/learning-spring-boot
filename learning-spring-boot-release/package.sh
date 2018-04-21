#!/usr/bin/env bash

echo "mvn begin"

echo `pwd`

mvn -P package $@ clean package spring-boot:repackage assembly:assembly -DskipTests

echo "mvn end"
