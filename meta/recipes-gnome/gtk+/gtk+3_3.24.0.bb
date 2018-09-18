require gtk+3.inc

MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI = "http://ftp.gnome.org/pub/gnome/sources/gtk+/${MAJ_VER}/gtk+-${PV}.tar.xz \
           file://0001-Hardcoded-libtool.patch \
           file://0002-Do-not-try-to-initialize-GL-without-libGL.patch \
           file://0003-Add-disable-opengl-configure-option.patch \
          "
SRC_URI[md5sum] = "7ecfbcb662384c8b466dc342bf295f4d"
SRC_URI[sha256sum] = "02e991389277206253d79884d10e5aa06fd78fdf7a5096799dbe3c97a05e32a8"

S = "${WORKDIR}/gtk+-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://gtk/gtk.h;endline=25;md5=1d8dc0fccdbfa26287a271dce88af737 \
                    file://gdk/gdk.h;endline=25;md5=c920ce39dc88c6f06d3e7c50e08086f2 \
                    file://tests/testgtk.c;endline=25;md5=cb732daee1d82af7a2bf953cf3cf26f1"
