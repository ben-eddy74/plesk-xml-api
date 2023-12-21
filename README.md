# Plesk XML API

## Generate java classes from Plesk xsd files

```shell
D:\Java\jaxb-ri\bin\xjc.bat -nv -p plesk.xml.api.input -b _agent_input_binding.xml agent_input.xsd
```

```shell
D:\Java\jaxb-ri\bin\xjc.bat -XautoNameResolution -nv -p plesk.xml.api.output -b _agent_output_binding.xml agent_output.xsd
```