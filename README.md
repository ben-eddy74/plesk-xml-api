# Plesk XML API

This is a Java project to easily generate classes and to interact with Plesk XML API. 

Java classes can be generated from the schema files by using a binding compiler. Because the schema contains some errors, a bindings file must be used to resolve some conflicting issues. To make the process easier, you can use this project. The supplied bindings files also makes some fields prettier.

** note: this repo is not affiliated and does not contain the Plesk XML API schema files **

## Generate java classes from Plesk XML API schema files

1. Have Maven ready to go
2. Clone this repo
3. Download the schema files of your preferred version from /usr/local/psa/admin/htdocs/schemas/rpc of your Plesk Server
4. Move the xsd files to src/main/xsd
5. Run mvn clean package

Make sure to use the clean goal whenever you make changes otherwise the bindings compiler might not run.

## Generate java classes from Plesk XML API schema files on your own

If you just want to generate the classes or don't want to use Maven, download  the [Eclipse implementation of JAXB](https://github.com/eclipse-ee4j/jaxb-ri) and run:

```shell
/path/to/xjc.sh -nv -p plesk.xml.api.input -b src/main/xjb/agent_input.xjb agent_input.xsd
/path/to/xjc.sh -XautoNameResolution -nv -p plesk.xml.api.output -b src/main/xjb/agent_output.xjb agent_output.xsd
```

Or on Windows:

```cmd
\path\to\xjc.bat -nv -p plesk.xml.api.input -b src\main\xjb\agent_input.xjb agent_input.xsd
\path\to\xjc.bat -XautoNameResolution -nv -p plesk.xml.api.output -b src\main\xjb\agent_output.xjb agent_output.xsd
```
