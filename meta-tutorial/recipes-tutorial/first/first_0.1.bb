# Copyright (C) 2016 Renat Gabdulhakov <renat.gabdulhakov@harman.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "I'm the first recipe"
HOMEPAGE = ""
LICENSE = ""
SECTION = ""
DEPENDS = ""

SRC_URI = ""

PR = "r1"

do_build () {
    echo "first: some shell script running as build"
}
