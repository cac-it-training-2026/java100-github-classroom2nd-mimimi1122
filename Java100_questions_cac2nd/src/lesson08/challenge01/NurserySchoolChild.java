package lesson08.challenge01;

public class NurserySchoolChild {
	String name;

	public NurserySchoolChild(String name) {
		this.name = name;
	}

	void Play() {
		System.out.println("遊ぶよ～。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
