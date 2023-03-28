public class HelloWorld {
	
	private int i;
	private String name;
	private String text;
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
