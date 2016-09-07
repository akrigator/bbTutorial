# Copyright (C) 2016 Renat Gabdulhakov <renat.gabdulhakov@harman.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "I'm the first recipe"
HOMEPAGE = ""
LICENSE = ""
SECTION = ""
DEPENDS = ""

SRC_URI = ""

PR = "r1"

shellFunction () {
    echo "I'm shellFunction"
    shellFunctionTwo
}
python bitbakeFunction () {
    bb.plain("I'm bitbakeFunction")
    bb.build.exec_func("bitbakeFunctionTwo", d)
}
def pythonFunction():
    bb.plain("I'm pythonFunction")
    pythonFunctionTwo()


shellFunctionTwo () {
    echo "I'm shellFunctionTwo"
}
python bitbakeFunctionTwo () {
    bb.plain("I'm bitbakeFunctionTwo")
    pythonFunctionThree()
}
def pythonFunctionTwo():
    bb.plain("I'm pythonFunctionTwo")

python bitbakeFunctionThree () {
    bb.plain("I'm bitbakeFunctionThree")
}
def pythonFunctionThree():
    bb.plain("I'm pythonFunctionThree")


addtask shellTask
do_shellTask[nostamp] = "1"
do_shellTask () {
    echo "I'm shellTask"
    shellFunction
}

addtask bitbakeTask
do_bitbakeTask[nostamp] = "1"
python do_bitbakeTask() {
    bb.plain("I'm bitbakeTask")
    bb.build.exec_func("bitbakeFunction", d)
    pythonFunction()
}

#addtask bye
#python do_bye() {
#    bb.warn("BYE")
#}

#addtask hello
#do_hello() {
#    echo "Hello" 
#    echo ${@bb.plain("HELLO")}
#}
#addtask hello before do_bye


