# Plesk XML API

## Generate java classes from Plesk xsd files

1. Download the schema files of your preferred version from /usr/local/psa/admin/htdocs/schemas/rpc
2. Save the xsd files to src/main/xsd
3. Run mvn clean compile

```shell
D:\Java\jaxb-ri\bin\xjc.bat -nv -p plesk.xml.api.input -b _agent_input_binding.xml agent_input.xsd
```

```shell
D:\Java\jaxb-ri\bin\xjc.bat -XautoNameResolution -nv -p plesk.xml.api.output -b _agent_output_binding.xml agent_output.xsd
```