package method;

public class Car {

	Machine m;
	
	public Car(Machine m){
		this.m=m;
	}
	
	public void display(){
		System.out.println(this.m.power);
	}
	
	public Car myCar(){
		
		return this;
	}
	
}
