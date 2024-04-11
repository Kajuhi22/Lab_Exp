
import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;  
public class keyevent extends Applet implements KeyListener 
{ 
String s1=" "; 
int x,y; 
public void init() 
{ 
addKeyListener(this); 
requestFocus(); 
} 
public void keyPressed(KeyEvent ke) 
{ 
x=100; 
y=200; 
s1= "key pressed "; 
repaint(); 
} 
public void keyReleased(KeyEvent ke) 
{ 
x=100; 
y=400; 
s1= "key Released "; 
repaint(); 
} 
public void keyTyped(KeyEvent ke) 
{ 
s1=s1+ke.getKeyChar(); 
repaint(); 
} 
public void paint(Graphics g) 
{ 
g.drawString(s1,x,y); 
} 
}