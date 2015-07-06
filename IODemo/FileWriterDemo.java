/*
字符流输出
*/
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo{

	public static void main(String[] args) throws IOException{
		//加个true是续写
		FileWriter fw=new FileWriter("demo.txt",true);
		/*
		数据写入到临时缓冲区里面
		*/
		fw.write("abcdefgi\r\n");
		/*
		刷新缓冲区
		*/
		fw.flush();
		//关闭流
		fw.close();
	}

}