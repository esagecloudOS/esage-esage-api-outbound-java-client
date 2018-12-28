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

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

import com.abiquo.bond.api.abqapi.VMMetadata;

/**
 * A class representing the result of a restore operation. A backup plugin will need to convert the
 * results it receives from the backup software into instances of this class which will then be used
 * to update the Abiquo server.
 */
public class VMRestoreStatus implements Comparable<VMRestoreStatus>
{
    private String name;

    private String type = "complete";

    private ZonedDateTime dateUTC;

    private long size;

    private String result;

    private String vmRestorePoint;

    private String resultId;

    public VMRestoreStatus()
    {
        // TODO Auto-generated constructor stub
    }

    public Map<String, Object> getMetaData()
    {
        Map<String, Object> metadata = new HashMap<>();

        metadata.put(VMMetadata.DATE, dateUTC.format(VMBackupStatus.dateFormatter));
        metadata.put("name", name);
        metadata.put("size", size);
        metadata.put("type", type);
        metadata.put("result", result);

        return metadata;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setType(final String type)
    {
        this.type = type;
    }

    public void setDateUTC(final ZonedDateTime date)
    {
        this.dateUTC = date;
    }

    public void setSize(final long size)
    {
        this.size = size;
    }

    public void setResult(final String result)
    {
        this.result = result;
    }

    @Override
    public int compareTo(final VMRestoreStatus o)
    {
        return dateUTC.compareTo(o.dateUTC);
    }

    public String getVmRestorePoint()
    {
        return vmRestorePoint;
    }

    public void setVmRestorePoint(final String vmRestorePoint)
    {
        this.vmRestorePoint = vmRestorePoint;
    }

    public String getName()
    {
        return name;
    }

    public String getResultId()
    {
        return resultId;
    }

    public void setResultId(final String resultId)
    {
        this.resultId = resultId;
    }

    public ZonedDateTime getDateUTC()
    {
        return dateUTC;
    }

}
