/*
StringBuffer��:
�ַ���������,���ڴ洢���ݵ�����

�ص�:
1.���ȿɱ�,���鳤�Ȳ��ɱ�
2.���Դ洢��ͬ���͵�����,����ֻ��һ������
3.����Ҫת���ַ�������ʹ��

Ӧ���Ǹ���������,Ӧ�þ߱�һ�¹���
1.���
	Stringbuffer append();
	Stringbuffer insert(int index,String str);
2.ɾ��
	Stringbuffer delete(int start,int end);
	Stringbuffer deleteCharAt(int index);//ɾ��ָ��λ�õ��ַ�
3.��ȡ
	���ַ�������һ��
	char charAt(int index);
4.�޸�
	Stringbuffer replace(int start,int end,String str)
	void setCharAt(int index,char ch);
*/

public class StringBufferDemo{
	public static void main(String[] args){
		methodDemo();
		methodDemo2();
	}
	public static void methodDemo(){
		//��������������
		StringBuffer sb=new StringBuffer();
		StringBuffer s1=sb.append(4);
		sb.append(5);
		System.out.println(sb);//45
		System.out.println(s1);//45
		System.out.println(sb==s1);//true �Ƚϵ�ַ ��ַָ��ͬһ������
		
	}
	public static void methodDemo2(){
		//��������������
		StringBuffer sb=new StringBuffer();
		sb.append(1);
		sb.append(2);
		sb.insert(1,"haha");
		//sb.deleteCharAt(0);
		//sb.delete(0,sb.length());//��ջ�����
		sb.replace(0,1,"");
		System.out.println(sb);//1haha2

	}
}