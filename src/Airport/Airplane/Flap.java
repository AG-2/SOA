package Airport.Airplane;

public class Flap {
	int id;
	int degree;
	
	public Flap(int id) {
		this.id = id;
	}
	public void neutral() {
        degree=0;
    }


    public void levelOne() {
        degree = 5;
    }
  
    public void levelTwo() {
        degree = 15;
    }

    public void levelThree() {
        degree = 25;
    }

    public int getId() {
        return id;
    }

    public int getDegree() {
        return degree;
    }

}
