package command;

public class Stereo {
	private int volLevel;
	private String name;
	public Stereo(String name) {
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " on");
	}
	
	public void setCD() {
		System.out.println(name + "CD is set");
	}
	
	public void setVolume(int volLevel) {
		this.volLevel = volLevel;
		System.out.println(name + " : Volume is " + this.volLevel);
	}
	
	public void off() {
		System.out.println(name + " off");
	}
}