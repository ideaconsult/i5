rem https://stackoverflow.com/questions/17055533/jaxb-xjc-parsing-fails-when-binding-is-used-together-with-catalog-bug
@echo on
set JHOME=%JAVA_HOME%
rem set JHOME=C:\Program Files\Java\jdk1.8.0_102

echo %JHOME%

cls

copy binding.xjb XJB > domain.log
echo IUCLID_6.4_files_XSD
for %%f in (XSD\IUCLID_6.4_files_XSD\*.xsd) do copy %%f XJC\%%~nxf
echo DOMAIN_2.11_XSD
for %%f in (XSD\DOMAIN_2.11_XSD\*.xsd) do copy %%f XJC\%%~nxf
echo CORE_5.14_XSD
for %%f in (XSD\CORE_5.14_XSD\*.xsd) do copy %%f XJC\%%~nxf
echo OECD_5.9_XSD
for %%f in (XSD\OECD_5.9_XSD\*.xsd) do copy %%f XJC\%%~nxf


for %%f in (XJC\*.xsd) do "%JHOME%\bin\xjc" -nv "%%f"  -b XJB\binding.xjb -d XJB  >> domain.log

rem -episode "XJB\%%~nxf".xjb  



