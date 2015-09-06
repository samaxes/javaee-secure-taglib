# Secure JSP Taglibs

Secure JSP Taglibs aims to solve authorization issues on the Java EE presentation layer.

It checks whether the currently authenticated user (if any) has been associated with any of the specified security roles.

## Maven Configuration

Add the Maven dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.samaxes.taglib</groupId>
    <artifactId>secure</artifactId>
    <version>1.0.2</version>
</dependency>
```

## Usage

First, declare the taglib in your JSP:

```xml
<%@ taglib uri="http://www.samaxes.com/taglib/secure" prefix="secure" %>
```

You can now evaluate the nested body content of the tag in order to check if the user has the roles which grant him access to view its content, use a comma-delimited list to check for multiple roles:

```xml
<secure:one roles="role1toevaluate, role2toevaluate">
    Show this content if the user has one of the specified roles.
</secure:one>
```

```xml
<secure:all roles="role1toevaluate, role2toevaluate">
    Show this content if the user has all the specified roles.
</secure:all>
```

```xml
<secure:none roles="role1toevaluate, role2toevaluate">
    Show this content if the user has none of the specified roles.
</secure:none>
```
