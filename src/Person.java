
public class Person {
	
	float height;
	private double weight;
	
	//get weight
	public double getWeight() {
		return weight;
	}
	
	//set weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//constructor
	public Person(){
		this.height=6;
		this.setWeight(200);
	}
	
	public void walks(){
		this.setWeight(this.getWeight() * 0.9);
		System.out.println("You lost weight!");
		System.out.println("You weigh: "+ this.getWeight()+"kg");
	}
	
	public void eats(){
		this.setWeight(this.getWeight() * 1.2);
		System.out.println("You gained weight!");
		System.out.println("You weigh: "+this.getWeight()+"kg");
	}
}
