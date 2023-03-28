public class HelloWorld {
	
	private int i;
<<<<<<< HEAD
	private String name;
=======
	private String text;
>>>>>>> ddc8473da92ddbe655ed913bcb7c918513d8bf7a
	public HelloWorld() {
		i = 0;
		this.text = "";
	
	}

	public HelloWorld(String text) {
		this.text = text;
		System.out.println(text);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;	
	}

	public getName() {
		return this.name;
	}

	public setName(String name) {
		this.name = name;
	}
}
