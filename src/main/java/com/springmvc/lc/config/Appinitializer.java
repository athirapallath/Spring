package com.springmvc.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Here User have the control over dispatcher servlet
public class Appinitializer // implements WebApplicationInitializer 
{
	public void onStartup(ServletContext servletContext) throws ServletException {
	 
		
		 AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
	     webAppContext.register(LCConfig.class);

		 DispatcherServlet dispatcherServlet = new DispatcherServlet(webAppContext);
		 
		 ServletRegistration.Dynamic myDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
	     myDispatcherServlet.setLoadOnStartup(1);
	     myDispatcherServlet.addMapping("/website.com/*");
	}

}
