import java.net.URL; 
import java.net.URLClassLoader; 
public class App 
{ 
public static void main(String[] args) 
{ 
ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader(); 
URL[] urls = ((URLClassLoader)sysClassLoader).getURLs(); 
for(int i=0; i< urls.length; i++) 
{ 
System.out.println(urls[i].getFile()); 
} 
} 
} 