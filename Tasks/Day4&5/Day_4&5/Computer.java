
public class Computer {
	void comp() {
		System.out.println("Computer is ON");
	}
	class Processor{
		void pro() {
			System.out.println("Processor is Running");
		}
	}
	void memclass() {
		class Memory{
			void mem() {
				System.out.println("Memeory is ready to acces");
			}
		}
		Memory m = new Memory();
		m.mem();
	}
	
	void anonymousclass() {
		Runnable y = new Runnable() {
		@Override
		public void run() {
			System.out.println("Anonymous is Here !!");
		}
		};
		y.run();
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		Computer.Processor p = c.new Processor();
		
		c.comp();
		p.pro();
		c.memclass();
		c.anonymousclass();
	}

}
