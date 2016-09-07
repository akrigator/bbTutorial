# Copyright (C) 2016 Renat Gabdulhakov <renat.gabdulhakov@harman.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "I'm the second recipe"
HOMEPAGE = ""
LICENSE = ""
SECTION = ""
DEPENDS = ""

SRC_URI = ""

PR = "r1"

inherit mybuild

def pyfunc(o):
    print(dir(o))

python do_mypatch () {
    bb.note ("running mypatch")
    pyfunc(d)
}

addtask mypatch before do_build
