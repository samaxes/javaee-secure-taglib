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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTag;

/**
 * Evalute the nested body content of this tag to test if the user authenticated has all the specified roles.
 * 
 * @author Samuel Santos
 * @version $Revision: 27 $
 */
public class SecureAll extends SecureBase {

    private static final long serialVersionUID = -4945659803003639112L;

    /**
     * Need to have all the roles specified for the body to be evaluated.
     * 
     * @return EVAL_BODY_BUFFERED if the authenticated user is included in all the specified logical "role" or SKIP_BODY
     *         otherwise
     * @throws JspException if an error occurred while processing this tag
     * @see BodyTag#doStartTag
     */
    public int doStartTag() throws JspException {
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
        String[] result = roles.split(ROLE_DELIMITER);

        for (String string : result) {
            if (!request.isUserInRole(string.trim())) {
                return SKIP_BODY;
            }
        }

        return EVAL_BODY_INCLUDE;
    }
}
