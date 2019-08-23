set projectLocation=C:\Users\dell\Desktop\New folder (2)\Modular_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml