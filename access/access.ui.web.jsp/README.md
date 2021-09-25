# Simple Calculator Web-App (JSP Edition)

## Description

A simple technology-demonstrator application using the **Jakarta Server Pages** (JSP) technology.

## Usage

### Release

The project can be released as a WAR file running the Maven as follows:

> mvn install

or

> mvn clean install

The resulting file can be found within the project's "target" subdirectory.

### In-Place Run

The project can be started in-place running the Maven as follows:

> mvn liberty:run

It starts an Open Liberty server instance in the foreground and deploys the current application within it.

Afterwards the application can be accessed in the rule under http://localhost:9080/app.calculator.access.ui.web.jsp. If
not, look in the command line log for the correct URL.
