
SUMMARY = "SDK for connecting to AWS IoT using Python."
HOMEPAGE = "https://github.com/aws/aws-iot-device-sdk-python.git"
AUTHOR = "Amazon Web Service <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9ac49901b833e769c7d6f21e8dbd7b30"

SRC_URI = "https://files.pythonhosted.org/packages/02/6f/f4440a73dc7f09e97db0b51b9caadc444324241314f19b16f1c561ac2dca/AWSIoTPythonSDK-1.4.7.tar.gz"
SRC_URI[md5sum] = "2b3df629827d8bc18ca4d927b4885a17"
SRC_URI[sha256sum] = "7e67c8cfeee8a1c8fd251bcc418de9d4dca697753565c9a9e614525179d9555d"

S = "${WORKDIR}/AWSIoTPythonSDK-1.4.7"

RDEPENDS_${PN} = ""

inherit setuptools
