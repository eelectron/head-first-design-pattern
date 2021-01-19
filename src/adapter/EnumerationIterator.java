package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator{
	Enumeration enu;
	public EnumerationIterator(Enumeration enu) {
		this.enu = enu;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enu.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enu.nextElement();
	}
}
