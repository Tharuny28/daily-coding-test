interface Playable{
	void play();
}
class Guitar implements Playable{
	@Override
	public void play() {
		System.out.println("saxsaphone is playing");
	}
}

class Piano implements Playable{
	@Override
	public void play() {
		System.out.println("keyboard is playing.");
	}
}
public class Main {
	public static void main(String[] args) {
		
	Playable p;
	
	p = new Saxsaphone();
	p.play();
	
	p = new Keyboard();
	p.play();
	}
}
