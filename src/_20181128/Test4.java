package _20181128;

public @interface Test4 {
	int timeout() default 0;
	String messange() default "";//不加錯誤訊息會給""
}
