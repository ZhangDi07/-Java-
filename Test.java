package capacity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();//创建CPU对象
		cpu.setSpeed(2200);
		HardDisk disk=new HardDisk();//创建HardDisk对象
		disk.setAmount(200);
		PC pc=new PC();//创建PC对象
		pc.setCpu(cpu);
		pc.setHD(disk);
		pc.show();
		PC pc2=new PC(6000, 100);
		cpu.speak(1.8, "368天");
		if(disk.iOpen(true)) {
			disk.hello();
		}else {
			disk.sorry();
		}
	}

}
