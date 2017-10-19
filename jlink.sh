#!/usr/bin/env bash

$JAVA_HOME/bin/jlink --module-path lib:$JAVA_HOME/jmods --output example-jre --add-modules example.main --launcher main=example.main/com.n26.main.Main
