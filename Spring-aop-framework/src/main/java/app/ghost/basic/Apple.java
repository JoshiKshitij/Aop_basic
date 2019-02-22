package app.ghost.basic;

public class Apple {

	private String name;
	private int noOfSeeds;

	@Override
	public String toString() {
		return "Apple [name=" + name + ", noOfSeeds=" + noOfSeeds + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfSeeds() {
		return noOfSeeds;
	}

	public void setNoOfSeeds(int noOfSeeds) {
		this.noOfSeeds = noOfSeeds;
	}

}
