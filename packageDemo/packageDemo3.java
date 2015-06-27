/**
* java中包的概念
* 包就像一个目录结构
* 声明一个包时，声明语句放在所有类的最前面

*/
import qingguow.packageDemo;

public class packageDemo3 extends packageDemo{
	public static void main(String[] args){
		packageDemo3 p=new packageDemo3();
		p.show();			//继承的才可以调用 protected的方法

		System.out.println("packageDemo3继承不同包的类");
	}

}