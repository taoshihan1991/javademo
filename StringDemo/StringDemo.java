/*
String����ص�:
�ַ�������һ������ʼ���Ͳ��ᱻ�ı�
*/

public class StringDemo{
	public static void main(String[] args){
		String s="abc";//"abc"�洢���ַ�����������
		//s="nba";//������������
		String s1="abc";//����������,��ֱ��ָ����
		System.out.println(s==s1);//true

		stringDemo1();
	}
	/*
	��ʾ�ַ�������ĵڶ��ַ�ʽ,
	*/
	private static void stringDemo1(){
		String s=new String("abc");//����һ���ַ��������ڳ�������
		String s1=new String("abc");//��������������,û�ó����� newһ���ַ��������ڶ��ڴ���
		System.out.println(s==s1);//false

		/*
		String���е�equals��д��Object��ķ���
		��ʵ���ǱȽ��ַ�������
		*/
		System.out.println(s.equals(s1));//true ����Ƚ�
	}

}