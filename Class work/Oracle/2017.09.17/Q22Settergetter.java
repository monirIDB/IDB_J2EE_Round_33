public class Q22settergetter{
	int id;
	String name:
	Date dob;
	float height;
	boolean married;
	public Q22settergetter(){
		
	}
	public Q22settergetter(int id, String name, Date dob, float height, boolean married){
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.height=height;
		this.married=married;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String id){
		this.name=name;
	}
	public Date getDob(){
		return dob;
	}
	public void setDob(Date id){
		this.dob=dob;
	}
	public float getHeight(){
		return height;
	}
	public void setHeight(float height){
		this.height=height;
	}
	public boolean isMarried(){
		return married;
	}
	public void setMarried(int married){
		this.married=married;
	}
	
}