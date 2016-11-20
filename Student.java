import java.util.*;

class Student 
{

private String name = null; 
private int studentNum = 0;


Student (String name, int sNum){
	this.name = name;
	this.studentNum = sNum;
}


public String getName()
{
	return name;
}

public static void main(String[] args)
{
Student s1 = new Student("A",55);
Student s3 = new Student("C",57);
Student s2 = new Student("B",56);

List<String> studentNameList = new ArrayList<String>();
studentNameList.add(s1.getName());
studentNameList.add(s3.getName());
studentNameList.add(s2.getName());

Collections.sort(studentNameList);

for(int i = 0; i<studentNameList.size();i++)
{
System.out.println(studentNameList.get(i));
}
}
}