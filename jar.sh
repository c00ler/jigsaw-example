#!/usr/bin/env bash

mkdir lib
echo "Creating example.text.jar"
jar --create --file lib/example.text.jar -C mods/example.text .
echo "Creating example.main.jar"
jar --create --file lib/example.main.jar -C mods/example.main .
