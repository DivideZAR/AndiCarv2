#!/bin/sh
GRADLE_HOME=/tmp/gradle-8.5
if [ ! -d "$GRADLE_HOME" ]; then
  curl -sL https://services.gradle.org/distributions/gradle-8.5-bin.zip -o /tmp/gradle-8.5-bin.zip
  unzip -q /tmp/gradle-8.5-bin.zip -d /tmp
fi
exec "$GRADLE_HOME/bin/gradle" "$@"
