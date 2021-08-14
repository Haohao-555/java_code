package work;
//定时任务处理
import java.util.Timer;
import java.util.TimerTask;

//java.util.TimerTask类：实现定时任务处理
//java.util.Timer类:进行任务启动
class MyTask extends TimerTask{//任务主体
	@Override
	public void run() {//多线程处理方法
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"定时任务执行，当前时间"+System.currentTimeMillis());
	}
}
public class JavaAPIdemo {
  public static void main(String[] args) {
	Timer timer=new Timer();//定时任务体
    timer.scheduleAtFixedRate(new MyTask(),100, 1000);	//设置100毫秒后执行程序，每隔1秒执行一次
	//timer.schedule(new MyTask(), 0);//延迟时间设置为0，立即启动。
}
}
