/**
* java中包的概念
* 包就像一个目录结构
* 声明一个包时，声明语句放在所有类的最前面

*/
import qingguow.packageDemo;

public class packageDemo2{
	public static void main(String[] args){
		//qingguow.packageDemo a=new qingguow.packageDemo(); 第一种方式
		packageDemo a=new packageDemo(); //第二种方式 import qingguow.packageDemo;
		a.show();												//public 的才可以直接调用

		System.out.println("packageDemo2调用其他类方法");
	}
}