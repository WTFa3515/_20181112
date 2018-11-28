package _20181128;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public @interface Test5 {
	Class expected() default Default.class;
	class Default{}	
}
