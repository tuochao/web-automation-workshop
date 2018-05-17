#!/usr/bin/env bash
DOCKERFILE="$(dirname $0)/../Dockerfile"
docker build --rm -t=web-automation -f $DOCKERFILE .

