package _20181128;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import static java.lang.System.out;

public class DebugTool {
	public static void main(String[] args) throws NoSuchMethodException {
		Class<Other> c = Other.class;
		Method method = c.getMethod("doOther");
		if(method.isAnnotationPresent(Debug.class)) {
		out.println("�w�]�w @Debug �е�");
		// ���o @Debug ���
		Debug debug = method.getAnnotation(Debug.class);
		out.printf("value: %s%n", debug.value());
		out.printf("name : %s%n", debug.name());
		} else {
		out.println("�S���]�w @Debug �е�");
		Annotation[] annotations = method.getAnnotations();
		for (Annotation annotation: annotations) {
			out.println(annotation.annotationType().getName());
			}
		}
	}
}
