/*
StringBuffer类:
字符串缓冲区,用于存储数据的容器

特点:
1.长度可变,数组长度不可变
2.可以存储不同类型的数据,数组只能一种类型
3.最终要转成字符串进行使用

应该是个容器对象,应该具备一下功能
1.添加
	Stringbuffer append();
	Stringbuffer insert(int index,String str);
2.删除
	Stringbuffer delete(int start,int end);
	Stringbuffer deleteCharAt(int index);//删除指定位置的字符
3.获取
	跟字符串对象一样
	char charAt(int index);
4.修改
	Stringbuffer replace(int start,int end,String str)
	void setCharAt(int index,char ch);
*/

public class StringBufferDemo{
	public static void main(String[] args){
		methodDemo();
		methodDemo2();
	}
	public static void methodDemo(){
		//创建缓冲区对象
		StringBuffer sb=new StringBuffer();
		StringBuffer s1=sb.append(4);
		sb.append(5);
		System.out.println(sb);//45
		System.out.println(s1);//45
		System.out.println(sb==s1);//true 比较地址 地址指向同一个对象
		
	}
	public static void methodDemo2(){
		//创建缓冲区对象
		StringBuffer sb=new StringBuffer();
		sb.append(1);
		sb.append(2);
		sb.insert(1,"haha");
		//sb.deleteCharAt(0);
		//sb.delete(0,sb.length());//清空缓冲区
		sb.replace(0,1,"");
		System.out.println(sb);//1haha2

	}
}