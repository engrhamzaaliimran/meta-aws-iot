
SUMMARY = "cryptography is a package which provides cryptographic recipes and primitives to Python developers."
HOMEPAGE = "https://github.com/pyca/cryptography"
AUTHOR = "The cryptography developers <cryptography-dev@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.PSF;md5=43c37d21e1dbad10cddcd150ba2c0595"

SRC_URI = "https://files.pythonhosted.org/packages/be/60/da377e1bed002716fb2d5d1d1cab720f298cb33ecff7bf7adea72788e4e4/cryptography-2.8.tar.gz"
SRC_URI[md5sum] = "77730058b556c6d9838679a94c6229ce"
SRC_URI[sha256sum] = "3cda1f0ed8747339bbdf71b9f38ca74c7b592f24f65cdb3ab3765e4b02871651"

S = "${WORKDIR}/cryptography-2.8"

RDEPENDS_${PN} = "python-six python-cffi"

inherit setuptools
