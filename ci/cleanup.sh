#!/usr/bin/env bash
docker stop web-hp web-srp-pdp
docker rm web-hp web-srp-pdp
docker rmi web-test
docker rmi ${REPOSITORY_URL}/${HP_REPO_NAME}:${VERSION_HP}
docker rmi ${REPOSITORY_URL}/${SRP_PDP_REPO_NAME}:${VERSION_SRPPDP}
