
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 

public class Mouseevent extends Applet 
implements MouseListener, MouseMotionListener 
{ 
String s1=" "; 
int x,y; 
public void init() 
{ 
addMouseListener(this); 
addMouseMotionListener(this); 
} 
public void mouseClicked(MouseEvent me) 
{ 
x=100; 
y=100; 
s1="Mouse clicked"; 
repaint(); 
} 
public void mouseEntered(MouseEvent me) 
{ 
x=100; 
y=200; 
s1="Mouse entered"; 
repaint(); 
} 
public void mouseExited(MouseEvent me) 
{ 
x=100; 
y=300; 
s1="Mouse exited"; 
repaint(); 
} 
public void mousePressed(MouseEvent me) 
{ 
x=me.getX(); 
y=me.getY(); 
s1="Mouse Pressed"; 
repaint(); 
}
public void mouseReleased(MouseEvent me) 
{ 
x=me.getX(); 
y=me.getY(); 
s1="Mouse Realeased"; 
repaint(); 
} 
public void mouseDragged(MouseEvent me) 
{ 
x=me.getX(); 
y=me.getY(); 
s1="Mouse Dragged"; 
repaint(); 
} 
public void mouseMoved(MouseEvent me) 
{ 
x=me.getX(); 
y=me.getY(); 
s1="Mouse Moved"; 
repaint(); 
} 
public void paint(Graphics g) 
{ 
g.drawString(s1,x,y); 
} 
}