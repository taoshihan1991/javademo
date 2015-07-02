/*
String类的构造方法演示:
1. 获取字符串的长度
	int length()
2.根据位置获取字符
	char charAt(int index)
3.根据字符获取在字符串中第一次出现的位置
	int indexOf(int ch)
	int indexOf(int ch,int fromIndex);//从指定位置开始查找索引
	int indexOf(String str)
	int indexOf(String str,int fromIndex)
	int lastIndeOf(int ch);//从后往前找
*/

public class StringDemo1{
	public static void main(String[] args){
		construct();
		stringMethodDemo();
	}
	/*
	构造函数放字节数组 字符数组
	*/
	private static void construct(){
		String s=new String();//等效于String s="";不等效String s=null;
		byte[] arr={65,66,67,68};//字节数组
		String s1=new String(arr);
		System.out.println(s1);//ABCD

		char[] arr1={'w','a','b'};
		String s2=new String(arr1);
		System.out.println(s2);//wab
	}
	/*
	获取
	*/
	private static void stringMethodDemo(){
		String s="abcdea";
		System.out.println("length:"+s.length());
		System.out.println("index:"+s.indexOf('a'));
		System.out.println("lastIndex:"+s.lastIndexOf('a'));

		System.out.println("index:"+s.indexOf('k'));//不存在是-1
	}

}