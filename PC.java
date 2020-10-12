package capacity;
public class PC {
	private CPU cpu;
	private HardDisk HD;
	private float price;//价格
	private String colo;//颜色
	public PC() {
		
	}
	public PC(int sp,int am) {
		CPU cpu=new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(sp);
		HD.setAmount(am);
		System.out.println(cpu.getSpeed()+"..."+HD.getAmount());//验证是否赋值成功
	}
	public void setCpu(CPU c) {
		this.cpu = c;
	}

	public void setHD(HardDisk h) {
		this.HD = h;
	}

	public HardDisk getHD() {
		return HD;
	}

	public CPU getCpu() {
		return cpu;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColo() {
		return colo;
	}
	public void setColo(String colo) {
		this.colo = colo;
	}
	public void show() {
		cpu.getSpeed();//得到速度的值
		HD.getAmount();
		PC p=new PC();
		p.setPrice(2000);
		p.setColo("black");
		p.getPrice();
		p.getColo();
		System.out.println("PC的价格是："+p.getPrice()+"，"+"颜色是："+p.getColo());
		System.out.println("速度是："+cpu.getSpeed()+"，"+"容量是："+HD.getAmount());
	}
}
