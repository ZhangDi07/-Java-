package capacity;

public class HardDisk {
	private int amount;
	private double size;//尺寸
	boolean open;//没有修饰符 默认
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int m) {
		this.amount = m;
	}
	//方法
	//1--true...开   -1--fasle..关
	public boolean iOpen(boolean o) {
		HardDisk h=new HardDisk();
		h.setOpen(o);
		return h.isOpen();	
	}
	public void hello() {
		HardDisk ha=new HardDisk();
		ha.setSize(6.00);
		System.out.println("你好我是硬盘我是大小为"+ha.getSize());
	}
	public void sorry() {
		System.out.println("error 接触不良");
	}


}
