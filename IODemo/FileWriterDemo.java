/*
�ַ������
*/
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo{

	public static void main(String[] args) throws IOException{
		//�Ӹ�true����д
		FileWriter fw=new FileWriter("demo.txt",true);
		/*
		����д�뵽��ʱ����������
		*/
		fw.write("abcdefgi\r\n");
		/*
		ˢ�»�����
		*/
		fw.flush();
		//�ر���
		fw.close();
	}

}