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
package com.abiquo.bond.api.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateUtils
{
    private static ZoneId systemDefaultZoneId = ZoneId.systemDefault();

    public static LocalDateTime fromEpochMilliseconds(final Long fromEpoch)
    {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(fromEpoch), systemDefaultZoneId);
    }

    public static LocalDateTime fromDate(final Date date)
    {
        return fromEpochMilliseconds(date.getTime());
    }

    public static ZonedDateTime fromEpochMillisecondsZoned(final Long fromEpoch, final ZoneId zoneId)
    {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(fromEpoch), zoneId);
    }

    public static ZonedDateTime fromDateZoned(final Date date, final ZoneId zoneId)
    {
        return fromEpochMillisecondsZoned(date.getTime(), zoneId);
    }

}
