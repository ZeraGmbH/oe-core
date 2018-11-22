#
# Default preferred versions
#

# Force the python versions in one place
PYTHON_BASEVERSION ?= "2.7"
PREFERRED_VERSION_python ?= "2.7.3"
PREFERRED_VERSION_python-native ?= "2.7.3"

# Force the older version of liberation-fonts until we fix the fontforge issue
PREFERRED_VERSION_liberation-fonts ?= "1.04"

# workaround gmp-native build error by using 6.x
PREFERRED_VERSION_gmp ?= "5.1.0"
PREFERRED_VERSION_gmp-native ?= "6.1.2"

