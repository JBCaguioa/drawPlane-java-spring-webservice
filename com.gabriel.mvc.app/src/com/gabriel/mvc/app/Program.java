package com.gabriel.mvc.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gabriel.mvc.shapeimpl.Plane;
import com.gabriel.mvc.shapesfx.Location;

public class Program {
	
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  	      
	  
        Plane plane=(Plane) factory.getBean("plane");	  
		
		PlaneView planeView = new PlaneView();
		planeView.init(plane);
		planeView.initUI();

		PlaneController planeController  = new PlaneController ();
		planeController.init(plane,planeView);
		planeController.initUI();
		
	}

}
