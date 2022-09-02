OBMC_MACHINE_FEATURES += "\
        obmc-host-ipmi \
        "

VIRTUAL-RUNTIME_skeleton_workbook = "${MACHINE}-config"


PREFERRED_PROVIDER_virtual/obmc-host-ipmi-hw = "phosphor-ipmi-kcs"


# add all the upstream intel override fixes
# OVERRIDES .= ":ysemi"