
SUMMARY = "Python 2 and 3 compatibility utilities"
HOMEPAGE = "https://github.com/benjaminp/six"
AUTHOR = "Benjamin Peterson <benjamin@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=43cfc9e4ac0e377acfb9b76f56b8415d"

SRC_URI = "https://files.pythonhosted.org/packages/21/9f/b251f7f8a76dec1d6651be194dfba8fb8d7781d10ab3987190de8391d08e/six-1.14.0.tar.gz"
SRC_URI[md5sum] = "21674588a57e649d1a6d977ec3122140"
SRC_URI[sha256sum] = "236bdbdce46e6e6a3d61a337c0f8b763ca1e8717c03b369e87a7ec7ce1319c0a"

S = "${WORKDIR}/six-1.14.0"

RDEPENDS_${PN} = ""

inherit setuptools
