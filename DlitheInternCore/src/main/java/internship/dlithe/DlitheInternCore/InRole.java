package internship.dlithe.DlitheInternCore;

public class InRole {
	public static void main(String[] args) {
		
		System.out.println("Dlithe Consultancy");
		Holder student1=new Holder();
		student1.name="Saurav S Poojary";
		student1.mobile=4365286354L;
		student1.cgpa=5.6666;
		
		Holder student2=new Holder();
		student2.name="urav S Poojary";
		student2.mobile=65286354L;
		student2.cgpa=5.666;
		student2.confirm();
	
	}

}
//wrapper class:Integer,Short,Long,Float,Double,Boolean,Byte,Character
class Holder{
	String name,skill;
	Long mobile;
	Double cgpa;
	
	public void confirm() {
		System.out.println(name+" "+mobile+" "+cgpa);
	}
	
	
}

