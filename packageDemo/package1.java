/**
* java中包的概念
* 包就像一个目录结构
* 声明一个包时，声明语句放在所有类的最前面
* package java.wp;
* 第二种方式引入特定的类
* import java.util.Date;
* 系统的默认引入的包是java.lang
*/
import java.util.*;
//import java.util.Date;
//package java.wp;

public class package1{
	public static void main(String[] args){
		System.out.println(new Date());//这样会提示找不到类 Date;
		/**
		* 第一种方式在每一个类名前加上完整的包名
		*
		*/
		//System.out.println(new java.util.Date());
	}
}