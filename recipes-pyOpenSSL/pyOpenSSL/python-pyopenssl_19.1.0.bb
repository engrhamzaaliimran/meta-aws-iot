
SUMMARY = "Python wrapper module around the OpenSSL library"
HOMEPAGE = "https://pyopenssl.org/"
AUTHOR = "The pyOpenSSL developers <cryptography-dev@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/0d/1d/6cc4bd4e79f78be6640fab268555a11af48474fac9df187c3361a1d1d2f0/pyOpenSSL-19.1.0.tar.gz"
SRC_URI[md5sum] = "d9804fedbd1eb0c7d9243397b1fbf972"
SRC_URI[sha256sum] = "9a24494b2602aaf402be5c9e30a0b82d4a5c67528fe8fb475e3f3bc00dd69507"

S = "${WORKDIR}/pyOpenSSL-19.1.0"

RDEPENDS_${PN} = "python-cryptography python-six"

inherit setuptools
