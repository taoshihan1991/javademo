/*
String��Ĺ��췽����ʾ:
1. ��ȡ�ַ����ĳ���
	int length()
2.����λ�û�ȡ�ַ�
	char charAt(int index)
3.�����ַ���ȡ���ַ����е�һ�γ��ֵ�λ��
	int indexOf(int ch)
	int indexOf(int ch,int fromIndex);//��ָ��λ�ÿ�ʼ��������
	int indexOf(String str)
	int indexOf(String str,int fromIndex)
	int lastIndeOf(int ch);//�Ӻ���ǰ��
*/

public class StringDemo1{
	public static void main(String[] args){
		construct();
		stringMethodDemo();
	}
	/*
	���캯�����ֽ����� �ַ�����
	*/
	private static void construct(){
		String s=new String();//��Ч��String s="";����ЧString s=null;
		byte[] arr={65,66,67,68};//�ֽ�����
		String s1=new String(arr);
		System.out.println(s1);//ABCD

		char[] arr1={'w','a','b'};
		String s2=new String(arr1);
		System.out.println(s2);//wab
	}
	/*
	��ȡ
	*/
	private static void stringMethodDemo(){
		String s="abcdea";
		System.out.println("length:"+s.length());
		System.out.println("index:"+s.indexOf('a'));
		System.out.println("lastIndex:"+s.lastIndexOf('a'));

		System.out.println("index:"+s.indexOf('k'));//��������-1
	}

}