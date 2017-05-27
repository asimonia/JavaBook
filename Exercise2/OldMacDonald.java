class Cow {
	public void moo() {
		System.out.println("Cow says moo.");
	}
}

class Pig {
	public void oink() {
		System.out.println("Pig says oink.");
	}
}


public class OldMacDonald {

	public static void main(String[] args) {
		Cow maudine = new Cow();
		Cow pauline = new Cow();
		maudine.moo();
		pauline.moo();

		Pig snowball = new Pig();
		snowball.oink();
		snowball.oink();

		Pig ball = new Pig();
		ball.oink();

		Duck ferdinand = new Duck();
		ferdinand.quack();
	}
}

class Duck {
	public void quack() {
		System.out.println("Duck says quack.");
	}
}