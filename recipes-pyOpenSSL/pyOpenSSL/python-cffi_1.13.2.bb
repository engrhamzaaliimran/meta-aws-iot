
SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "http://cffi.readthedocs.org"
AUTHOR = "Armin Rigo, Maciej Fijalkowski <python-cffi@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

SRC_URI = "https://files.pythonhosted.org/packages/2d/bf/960e5a422db3ac1a5e612cb35ca436c3fc985ed4b7ed13a1b4879006f450/cffi-1.13.2.tar.gz"
SRC_URI[md5sum] = "652203cf99faa254efff7fab23c2f3a2"
SRC_URI[sha256sum] = "599a1e8ff057ac530c9ad1778293c665cb81a791421f46922d80a86473c13346"

S = "${WORKDIR}/cffi-1.13.2"

RDEPENDS_${PN} = ""

inherit setuptools
