This is a JAX-WS web services on Tomcat servlet container.
-------------
Building steps:
Create a Java web application project web service on NetBeans IDE.>>
Create a sun-jaxws.xml that defines web service implementation class.>>
Create a **standard web.xml** that defines WSServletContextListener, WSServlet and structure for the web project.>>
Build the project and Deploy it accordingly on NetBeans with the connected server (Apache Tomcat 10.1).>>
Copy JAX-WS dependencies to “${Tomcat}/lib” folder.>>
Copy WAR to “${Tomcat}/webapp” folder.>>
Start the service in the Tomcat manager.>>
