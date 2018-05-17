#!/usr/bin/env bash
gradle cucumberBasic

FILE="/tmp/cucumber-html-reports"
if [ -d ${FILE} ]
then
    echo "Previous result report found, will remove it."
    rm -rf ${FILE}
else
    echo "Previous result report not found, will generate new one."
fi
cp -r /test/build/reports/cucumber/cucumber-html-reports /tmp

if [ ${STATUS_CODE} -eq 0 ]
then
    echo "Exit with successful code."
else
    echo "Exit with failed code."
fi
exit ${STATUS_CODE}