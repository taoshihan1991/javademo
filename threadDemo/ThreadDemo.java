/*
进程:正在进行中的程序
垃圾回收机制的线程

创建线程的方式1:
继承Thread类,覆盖Thread类里面的run()方法
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
				this.currentThread().sleep(1000);//currentThread()当前线程,getName()线程名称
				timer++;
				System.out.println("时间流逝"+timer+",线程:"+currentThread().getName());
			}		
		}catch(InterruptedException e){
		
		}

		
	}


}
public class ThreadDemo{
	public static void main(String[] args){
		Demo d1=new Demo("taoshihan");
		d1.start();//开启线程,调用run方法

		Demo d2=new Demo("陶士涵");
		d2.start();
		System.out.println("主线程"+Thread.currentThread().getName());
	}

}