@echo on
@ECHO %1
"{JAVA_HOME}\bin\xjc" -nv "Endpoints_XSD_5.5\%1_20130101_000000.xsd"  -xmlschema -p eu.europa.echa.schemas.iuclid5._20130101.studyrecord.%1 -verbose -catalog "Endpoints_XSD_5.5\xsd"
































































