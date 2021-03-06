/**
 * The Abiquo Platform
 * Cloud management application for hybrid clouds
 * Copyright (C) 2008 - Abiquo Holdings S.L.
 *
 * This application is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC
 * LICENSE as published by the Free Software Foundation under
 * version 3 of the License
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * LESSER GENERAL PUBLIC LICENSE v.3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */
package com.abiquo.bond.api.response;

import java.util.List;

public class VMBackupRestorePairStatusList
{
    public final String vmName;

    public final List<VMBackupRestorePairStatus> pairStatusesList;

    public VMBackupRestorePairStatusList(final String vmName,
        final List<VMBackupRestorePairStatus> pairStatusesList)
    {
        this.vmName = vmName;
        this.pairStatusesList = pairStatusesList;
    }

    public String getVmName()
    {
        return vmName;
    }

    public List<VMBackupRestorePairStatus> getPairStatusesList()
    {
        return pairStatusesList;
    }

}
