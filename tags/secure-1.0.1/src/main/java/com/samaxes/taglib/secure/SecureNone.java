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

import javax.servlet.jsp.JspException;

/**
 * Evalute the nested body content of this tag to test if the user has none of the specified roles.
 * 
 * @author : Samuel Santos
 * @version : $Revision: 27 $
 */
public class SecureNone extends SecureOne {

    private static final long serialVersionUID = 6889348390902605306L;

    /**
     * Need to have none of the specified roles.
     * 
     * @exception JspException if a JSP exception occurs
     */
    public int doStartTag() throws JspException {
        return (super.doStartTag() == EVAL_BODY_INCLUDE) ? SKIP_BODY : EVAL_BODY_INCLUDE;
    }
}
