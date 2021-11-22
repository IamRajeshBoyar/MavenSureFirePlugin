package junit;

public class JunitAnnotations {
	

	public void beforeClass() {
		System.out.println("this is beforeClass annotations");
	}
	public void before() {
		System.out.println("this is before annotations");
	}
	
	public void test() {
		System.out.println("this is before test annotations");
	}
	
	public void test1() {
		System.out.println("this is before test1 annotations");
	}
	
	public void afterClass() {
		System.out.println("this is afterClass annotations");
	}
	
	public void after() {
		System.out.println("this is after annotations");
		
	}
}
