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

package com.samaxes.taglibs.role;

import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * Evalute the nested body content of this tag to test if the user has all of
 * the specified roles.
 * 
 * @version : $LastChangedRevision$
 */
public class SecureAll extends SecureOne {

    /**
     * Need to have all the specified roles.
     * 
     * @exception JspException if a JSP exception occurs
     */
    public int doStartTag() throws JspException {
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        boolean hasRole = true;

        StringTokenizer st = new StringTokenizer(role, ROLE_DELIMITER, false);
        while (hasRole && st.hasMoreTokens()) {
            hasRole = request.isUserInRole(st.nextToken());
        }

        return (hasRole) ? EVAL_BODY_INCLUDE : SKIP_BODY;
    }
}
