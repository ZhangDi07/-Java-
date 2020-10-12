package capacity;

public class CPU {
	private int speed;
	
	public double rate;//速率
	protected String time;//时间
	public CPU() {
		
	}//构造方法1
	public CPU(double r,String t) {
		//super();
		this.rate=r;
		this.time=t;
	}//构造方法2
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public void speak(double r,String t) {
		CPU c=new CPU();//实例化
		c.setRate(r);
		c.setTime(t);
		String o;
		if(c.getRate()>1.60) {
			o="我是高性能处理器";
		}else {
			o="我是低端处理器";
		}
		System.out.println(o+"，"+"我已工作： "+c.getTime());
	}
}
