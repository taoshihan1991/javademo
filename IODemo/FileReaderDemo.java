/*
字符流输出
*/
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo{

	public static void main(String[] args) throws Exception{
		//method1();
		method2();

	}
	public static void method1() throws Exception{
		FileReader fr=new FileReader("demo.txt");
		//读取单个字符,如果没有返回-1 
		int ch=fr.read();
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		
		fr.close();
	}
	public static void method2() throws Exception{
		FileReader fr=new FileReader("demo.txt");
		char[] data=new char[1024];
		int ch=0;
		String str="";
		while((ch=fr.read(data))!=-1){
			str+=new String(data);
			
		}
		System.out.println(str);
		fr.close();
	}
}