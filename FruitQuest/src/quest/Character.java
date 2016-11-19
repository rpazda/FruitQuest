package quest;

import javax.swing.JFrame;

public class Character {

	//our fruits type
	private enum fruit_type{
		apple, banana, orange, pear, peach
	}

	//items a fruit could possibly acquire.
	// vitaminC increases ripeness,
	// icePack raises shelfLife,
	// baggie and basket increase bruiseResist to different degrees,
	// freshlyPiked increases tartness,
	// sugar increases sweetness.
	private enum item_type{
		vitaminC, icePack, basket, baggie, freshlyPicked, sugar
	}

	//the type of the fruit to pass into the charType function
	private String myFruit = null;
	//fruit attributes
	private int ripeness;
	private int sweetness;
	private int tartness;
	private int bruiseResist;
	//fruit health
	private int shelfLife;
	//fruit level
	private int level;
	//fruit's current items. max items is 5.
	private String[] items = new String[5];

	
	public Character(JFrame parent){
		initComponents();
	}
	
	private void initComponents() {

		//Initialize character properties
	}


	private void charType(String myFruit){

		switch(myFruit){

			case "apple":
				ripeness = 2;
				sweetness = 3;
				tartness = 2;
				bruiseResist = 2;
				shelfLife = 10;
				break;

			case "banana":
				ripeness = 3;
				sweetness = 2;
				tartness = 2;
				bruiseResist = 2;
				shelfLife = 10;
				break;

			case "orange":
				ripeness = 2;
				sweetness = 2;
				tartness = 2;
				bruiseResist = 3;
				shelfLife = 10;
				break;

			case "pear":
				ripeness = 2;
				sweetness = 2;
				tartness = 3;
				bruiseResist  = 2;
				shelfLife = 10;
				break;

			case "peach":
				ripeness = 2;
				sweetness = 4;
				tartness = 2;
				bruiseResist = 1;
				shelfLife = 10;
				break;
		}

	}

	public String getMyFruit() {
		return myFruit;
	}public void setMyFruit(String myFruit) {
		this.myFruit = myFruit;
	}public int getRipeness() {
		return ripeness;
	}public void setRipeness(int ripeness) {
		this.ripeness = ripeness;
	}public int getSweetness() {
		return sweetness;
	}public void setSweetness(int sweetness) {
		this.sweetness = sweetness;
	}public int getTartness() {
		return tartness;
	}public void setTartness(int tartness) {
		this.tartness = tartness;
	}public int getBruiseResist() {
		return bruiseResist;
	}public void setBruiseResist(int bruiseResist) {
		this.bruiseResist = bruiseResist;
	}public int getShelfLife() {
		return shelfLife;
	}public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}public int getLevel() {
		return level;
	}public void setLevel(int level) {
		this.level = level;
	}public String[] getItems() {
		return items;
	}public void setItems(String[] items) {
		this.items = items;
	}


	

}
