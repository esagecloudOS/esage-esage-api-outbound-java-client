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
package com.abiquo.bond.api.plugin;

import com.abiquo.bond.api.event.APIEvent;
import com.google.common.base.Optional;

@SuppressWarnings("serial")
public class PluginEventException extends PluginException
{
    private APIEvent event;

    public PluginEventException(final APIEvent event)
    {
        super();
        this.event = event;
    }

    public PluginEventException(final APIEvent event, final String message)
    {
        super(message);
        this.event = event;
    }

    public PluginEventException(final APIEvent event, final Throwable cause)
    {
        super(cause);
        this.event = event;
    }

    public PluginEventException(final APIEvent event, final String message, final Throwable cause)
    {
        super(message, cause);
        this.event = event;
    }

    public PluginEventException(final APIEvent event, final String message, final Throwable cause,
        final boolean enableSuppression, final boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
        this.event = event;
    }

    public Optional<APIEvent> getAPIEvent()
    {
        return Optional.fromNullable(event);
    }
}
