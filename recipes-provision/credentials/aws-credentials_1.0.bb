DESCRIPTION = "AWS iot credentials"
SECTION = "provisioning"
LICENSE = "MIT"

do_install () {
  # If credentials were provided, install to /etc/aws-credentials/
    install -d ${D}${sysconfdir}/aws-credentials/
    cp -R ${TOPDIR}/client_credentials ${D}${sysconfdir}/aws-credentials/
    install -d ${D}${sysconfdir}/
    cp -R ${TOPDIR}/src ${D}${sysconfdir}/
}
