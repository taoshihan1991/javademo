/*
����:���ڽ����еĳ���
�������ջ��Ƶ��߳�

�����̵߳ķ�ʽ1:
�̳�Thread��,����Thread�������run()����
*/
class Demo extends Thread
{
	public String name;
	boolean flag=true;
	int timer;
	Demo(String name){
		this.name=name;
	}
	public void run(){
		try{
			while(flag){
				this.currentThread().sleep(1000);//currentThread()��ǰ�߳�,getName()�߳�����
				timer++;
				System.out.println("ʱ������"+timer+",�߳�:"+currentThread().getName());
			}		
		}catch(InterruptedException e){
		
		}

		
	}


}
public class ThreadDemo{
	public static void main(String[] args){
		Demo d1=new Demo("taoshihan");
		d1.start();//�����߳�,����run����

		Demo d2=new Demo("��ʿ��");
		d2.start();
		System.out.println("���߳�"+Thread.currentThread().getName());
	}

}