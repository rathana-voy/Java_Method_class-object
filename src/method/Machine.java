package method;

public class Machine {

	float power=5.6f;
	
	public void print(){
		
		new Car(new Machine()).display();
	}
	
	public static void main(String[] args) {
		Machine m=new Machine();
		m.print();
	}
}
