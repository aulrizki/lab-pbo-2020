
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

 	private String name;
 	private int id;

 	public Main(){
 		name = "Java";
 	}

 	@Mutator1_value("xyz")
 	public void setName(String name) {
 		this.name = name;
 	}
 
 	@Mutator2_variable(variable = "xyz")
 	public int setId(int id){
 		this.id = id;
 	}

	@Accessor(variableName = "name", variableType = "int")
 		public int getId() {
 		return id;
 	}
 
 	//"variableType" bisa tidak dituliskan karenn memiliki default value
	// Namun jika tidak ada default value maka harus dituliskan secaraeksplisit
 	@Accessor(variableName = "xyz")
 	public String getName() {
 		return name;
 	}

	@Override
 	public boolean equals(Object otherName) {
 		String newName = (String) otherName;
 		int comparison = name.compareTo(newName);
 		return (comparison == 0);
 	}

 	public static void main(String[] args) {
 		System.out.println("No compiler error");
 	}
}