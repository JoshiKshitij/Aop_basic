package app.ghost.basic;

public class WaterMelon {
	
		private String name;
		private int noOfSeeds;
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
		@Override
		public String toString() {
			return "WaterMellon [name=" + name + ", noOfSeeds=" + noOfSeeds + "]";
		}
		
		
}
