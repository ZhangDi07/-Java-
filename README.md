# -Java-
Java课程作业项目
## 实验内容
用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，分别是PC,CPU,HardDisk,Test,Test是主类。  
1.PC类中设置几个属性，创建这些属性的get，set方法，用来传值；传创建两个构造方法用来初始化属性的值；写一个普通方法，用来输出相关内容
2.CPU类中设置几个属性，创建这些属性的get，set方法，用来传值；传创建两个构造方法用来初始化属性的值；写一个普通方法，用来输出相关内容并进行简单的逻辑判断
3.HardDisk类中，设置几个属性，创建这些属性的get，set方法，用来传值；写两个普通方法，用来输出相关内容和调用其他的简单方法
4.Test类中，分别实例化了PC,CPU,HardDisk,通过调用构造方法给类中的属性传值，并进行了简单的逻辑判断
## 实验目的
1.掌握不同的类型用法   
2.会在类中定义构造方法（无参和有参）    
3.掌握在类中定义方法并调用其属性    
4.掌握在方法中编写符合常理的逻辑判断  
5.熟悉通过不同的方法来给属性赋值  
6.掌握不同的修饰符对包的访问控制权限
## 实验过程
1.在capacity包下新建PC,CPU,HardDisk,Test4个类，其中Test加上main方法；  
2.CPU类中定义speed，rate,time并生成set,get方法新建无参构造方法和有参构造方法，新建无返回值有r,t，两个参数的speak（）方法并在其中实例化当前类并加以逻辑判断；  
3.HardDisk类中定义amount，size，open，生成setget方法，定义hello方法，定义sorry方法定义一个返回boolean类型的iOpen方法并传入参数，参数控制访问hello方法，sorry方法
PC类中定义CPU cpu，HardDisk HD，price，colo生成setget方法
## 核心方法
1. 方法1 构造方法
```
public CPU() {
		
	}//构造方法1
	public CPU(double r,String t) {
		//super();
		this.rate=r;
		this.time=t;
	}//构造方法2
```
2. 方法2 set get方法
```
public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;
	}
```
3.方法3 普通方法
```
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
```
## 实验结果
![alt ptupian](https://user.qzone.qq.com/927092933/infocenter)

## 实验感想
通过本次实验学会了在其他类中调用类中的属性，以及给类中的属性赋值/取值，定义有参，无参构造方法并进行调用，基本数据类型的具体的使用情况，不同访问控制符对访问的控制情况等，但是目前使用还不熟练，还需多练习。