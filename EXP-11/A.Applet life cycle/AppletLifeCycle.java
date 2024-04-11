import java.applet.*; 
import java.awt.*; 
public class AppletLifeCycle extends Applet 
{ 
public void init() 
{ 
System.out.println("Applet is initialized"); 
} 
public void start() 
{ 
System.out.println("Applet is started"); 
} 
public void stop() 
{ 
System.out.println("Applet execution is stopped"); 
} 
public void paint(Graphics g) 
{ 
System.out.println("Painting the Applet"); 
} 
public void destroy() 
{ 
System.out.println("Applet is Destroyed"); 
} 
} 