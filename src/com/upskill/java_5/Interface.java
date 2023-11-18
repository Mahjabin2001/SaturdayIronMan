package com.upskill.java_5;

public interface Interface {

	public abstract void iDoor();
	public abstract String iengine();
	
	public abstract String iColor();
	public abstract int iWheel();
}









/*

(parent)                    (keyword)                 (child)                (keyword)           (Gradchild)  
class                         extends					class
abstract class (+2)            extends				    class(-2=0)
interface(+2) 			    implements				    class(-2=0)
interface(+2)                 extends			      interface(+2+2=4)         implements         class (-4=0)
Interface(+2)					extends
Abstract class(+2)				extends


*/