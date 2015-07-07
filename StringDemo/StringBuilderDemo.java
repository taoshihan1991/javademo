/*
StringBuffer是线程同步的
StringBulider是线程不同步的

*/

public class StringBuilderDemo{
	public static void main(String[] args){
		int [] arr=new int[4];
		String s=arrToStr2(arr);
		System.out.println(s);
	}

		/*
	将一个int数组变成字符串
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
	将一个int数组变成字符串
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