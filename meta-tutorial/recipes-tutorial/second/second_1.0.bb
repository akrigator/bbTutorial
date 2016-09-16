# Copyright (C) 2016 Renat Gabdulhakov <renat.gabdulhakov@harman.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "I'm the second recipe"
HOMEPAGE = ""
LICENSE = ""
SECTION = ""
DEPENDS = ""

SRC_URI = ""

PR = "r1"

A = "1"
A_append = " 4"
A .= " 2"
A += "3"
A_prepend = "0 "

inherit mybuild

def pyfunc(o):
    print(dir(o))

do_mypatch[nostamp] = "1"
python do_mypatch () {
    bb.note ("running mypatch")
    bb.warn ("running mypatch")
    pyfunc(d)
    bb.warn (d.getVar('A', True))
}
addtask mypatch before do_build

