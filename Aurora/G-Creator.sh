#!/bin/sh

SCRIPT_DIR_RELATIVE=$(dirname $0)
SCRIPT_DIR_ABSOLUTE=$(cd $SCRIPT_DIR_RELATIVE; pwd)

cd $SCRIPT_DIR_ABSOLUTE

java -jar G-Creator.jar $@
