/*
StringBuffer���߳�ͬ����
StringBulider���̲߳�ͬ����

*/

public class StringBuilderDemo{
	public static void main(String[] args){
		int [] arr=new int[4];
		String s=arrToStr2(arr);
		System.out.println(s);
	}

		/*
	��һ��int�������ַ���
	*/
	public static String arrToStr2(int[] arr){
		StringBuilder sb=new StringBuilder();
		sb.append("[");

		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				sb.append(arr[i]+"]");
			}else{
				sb.append(arr[i]+",");
			}
		}
		return sb.toString();
	}
	/*
	��һ��int�������ַ���
	*/
	public static String arrToStr(int[] arr){
		String str="[";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				str+=arr[i]+"]";
			}else{
				str+=arr[i]+",";
			}
		}
		return str;
	}


}