package www.test.spring.beans;

public class HelloWorld {
private String name;
public void setName2(String name) {
	this.name=name;
}
public void hello() {
	System.out.println("this:"+name);
}
}
