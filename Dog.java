




public class Dog extends Animal{



	public Dog(String name, int legs){
		super(legs);
		this.name = name;
	}


	public String toString(){
		return(name + " " + legs+ " legs");
	}

}
	
