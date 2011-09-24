/*
 * $Id$
 *
 * Copyright 2007 samaxes.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.samaxes.taglib.secure;

import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * A base class for defining common properties of Secure JSP Taglibs.
 * 
 * @author Samuel Santos
 * @version $Revision$
 */
public abstract class SecureBase extends BodyTagSupport {

    private static final long serialVersionUID = 539174463308529233L;

    /**
     * The delimiter character for roles.
     */
    protected static final String ROLE_DELIMITER = ",";

    /**
     * The name of the security role to be checked for.
     */
    protected String roles;

    /**
     * Get the list of logical roles to be checked, comma separated.
     * 
     * @return the list of logical roles
     */
    public String getRoles() {
        return roles;
    }

    /**
     * Set the list of logical roles to be checked, comma separated.
     * 
     * @param roles the list of logical roles to set
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }
}
