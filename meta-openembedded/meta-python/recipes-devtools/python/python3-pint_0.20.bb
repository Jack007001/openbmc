SUMMARY = "Physical quantities module"
DESCRIPTION = "Physical quantities Python module"
HOMEPAGE = "https://github.com/hgrecco/pint"
SECTION = "devel/python"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bccf824202692270a1e0829a62e3f47b"

PYPI_PACKAGE := "Pint"

inherit pypi ptest python_setuptools_build_meta

SRC_URI[sha256sum] = "4035f6d1431913afd86a056959e35d342399b0ab7d6f8cad1f0f6058dc83fad8"

DEPENDS += "python3-setuptools-scm-native"

BBCLASSEXTEND = "native nativesdk"

SRC_URI += " \
	file://run-ptest \
"

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-setuptools \
    ${PYTHON_PN}-packaging \
"

RDEPENDS:${PN}-ptest += " \
	${PYTHON_PN}-pytest \
"

do_install_ptest() {
	install -d ${D}${PTEST_PATH}/testsuite
	cp -rf ${S}/pint/testsuite/* ${D}${PTEST_PATH}/testsuite/
}
