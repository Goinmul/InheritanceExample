package edu.handong.csee.java.example.inheritance;

class Faculty extends Person {
	
private int facultyNumber;
	
	public Faculty()    {
		super();        
		facultyNumber = 0;//Indicating no number yet    
	}
	
	public Faculty(String initialName, int initialStudentNumber){
		super(initialName);        
		facultyNumber = initialStudentNumber;    
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);        
		facultyNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return facultyNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {
		facultyNumber = newStudentNumber;
	}
	
	
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Faculty Number: " + facultyNumber); 
	}
	
	public boolean equals(Faculty otherStudent) {
		
		return this.hasSameName(otherStudent) && (this.facultyNumber == otherStudent.facultyNumber);
	} 


}
