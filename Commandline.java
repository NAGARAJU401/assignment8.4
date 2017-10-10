package Arguments;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Arguments
public class Commandline {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
			
		Integer firstNumber=new Integer(args[0]);
		//here it takes the value which we passed in the index arguments 
		Integer secondNumber=Integer.parseInt(args[3]); 
		//here in two ways we can  read integer value
		System.out.println("given arguments are :15 44 26 40 ");

		System.out.println("the output is :");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.

		System.out.println(firstNumber+" "+secondNumber);// here  it prints the values of index of size zero and of index size three

		System.out.println( firstNumber + secondNumber );// here it adds the two values of the given arguments
		// Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)

		   // = Integer.parseInt("15") + Integer.parseInt("40")

		   // = 15 + 40 = 55

		   // Because + = ADD when used on integers

	} // otherwise  a  "15" + "40" = "1540"
	}


