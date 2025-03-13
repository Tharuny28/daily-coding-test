public class Battery {
	int capacity;
	
	public int getcap(int cap) {
		this.capacity=cap;
		return cap;
	}
	 public void setcap() {
		 System.out.println("The Mobile capacity is"+capacity);
	 }
}

class Mobile{
	Battery b;
	
	public Mobile(int cap){
		b = new Battery();
		b.getcap(cap);
	}
	public void show() {
		b.setcap();
	}
	public static void main(String[] args) {
		Mobile m = new Mobile(6000);
		m.show();
	}
	
}
