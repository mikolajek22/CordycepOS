SUMMARY = "CordycepOS base image for Raspberry Pi 5"
LICENSE = "MIT"

inherit core-image

# Minimalny bootowalny system (to samo co core-image-minimal)
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

# Funkcje obrazu będące częścią produktu
IMAGE_FEATURES += "ssh-server-dropbear"

# Bez dodatkowych pakietów językowych (locale)
IMAGE_LINGUAS = " "
