import java.util.*;
public class Lab35 {
	public static void main(String[] args) {
		System.out.println("About to Schedule task");
		new Reminder(4);
	}

}
class Reminder{
	Timer timer;
	public Reminder(int seconds){
	timer=new Timer();
	timer.schedule(new RemindTask(),seconds*1000);
	
	}
class RemindTask extends TimerTask{
	public void run(){
		System.out.println("Time's Up!");
		timer.cancel();
	}
}
}