#!/usr/bin/env bash
docker rm -f $(docker ps -aq --filter name=web-automation)
docker run -i --rm --name=web-automation -v /dev/shm:/dev/shm -v /tmp:/tmp -w /test web-automation
