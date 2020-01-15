package test.main;

import test.mypac.MyFactory;
import test.mypac.MyFactory.Phone;

public class MainClass01 {
	public static void main(String[] args) {
		MyFactory factory=new MyFactory();
		factory.doSomething();
		Phone phone=factory.getPhone();
		phone.call();
	}
}
