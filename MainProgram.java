
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
       
        else if (studentID == 1813545) {
        	printInitialScreen_1813545();
        }
        
        else if(studentID==1812284){
        	calculate_1812284();
        }
        else if(studentID==1812967) {
        	InitialScreen_1812967();
        }
        else if(studentID == 1813592) {
        	print_1813592_screen();
        }
        else if(studentID == 1812084) {
        	printMainScreen_1812084();
        }
        else if(studentID == 1812597) {
        	printScreen_1812597();
        }
    }
    
    private void calculate_1812284() {
        boolean loop=true;
        int select;
        Scanner menu=new Scanner(System.in);
        while(loop) {
                System.out.println("[Student ID: 1812284]");
                System.out.println("1. Calculate Minimum Number\n2. Calculate Maximum Number\n");
                System.out.print("Enter menu number: ");
                select=menu.nextInt();
                if(select==1) {
                        int []array;
                        Scanner numbers=new Scanner(System.in);
                        System.out.print("How many numbers do you want to calculate minimum number? : ");
                        int num=numbers.nextInt();
                        array=new int[num];
                        System.out.print("Insert "+num+" numbers : ");
                        for(int i=0;i<num;i++)
                                array[i]=numbers.nextInt();
                        int min=getMinimum_1812284(array);
                        System.out.println("The smallest number from your insertion is "+min+".");
                        loop=false;
                        System.out.println("\nEnd the minimum calculate");
                }

                else if(select==2) {
                        int []array;
                        Scanner numbers=new Scanner(System.in);
                        System.out.print("How many numbers do you want to calculate maximum number? : ");
                        int num=numbers.nextInt();
                        array=new int[num];
                        System.out.print("Insert "+num+" numbers : ");
                        for(int i=0;i<num;i++)
                                array[i]=numbers.nextInt();
                        int max=getMaximum_1812284(array);
                        loop=false;
                        System.out.println("The smallest number from your insertion is "+max+".");
                        System.out.println("\nEnd the maximum calculate");
                }

                else {
                        System.out.println("Select correct menu");
                }
        }
    }

    public static int getMinimum_1812284(int []array) {
        int num=0;
        int min=array[0];
        for(int i=1; i<array.length;i++) {
                num=array[i];
                min=(num<min)?num:min;
        }
        return min;
    }

    public static int getMaximum_1812284(int []array) {
        int num=0;
        int max=array[0];
        for(int i=1; i<array.length;i++) {
                num=array[i];
                max=(num>max)?num:max;
        }
        return max;
    }
    
    
    public void printInitialScreen_1813545() {
    	int input = 0;
    	float num = 0;
    	float result = 0;
    	
    	input = selectMenu_1813545();
    	
    	if (input == 1 || input == 2) {
    		num = inputNumber_1813545();
    		
    		if (input == 1) 
        		result = calCeil_1813545(num);
    		
    		else if (input == 2) 
        		result = calFloor_1813545(num);
    		
    		printResult_1813545(result);
    	}
    	
    	else {
    		System.out.println("This number does not exist. Please choose 1 or 2.\n");
    	}
    }
    
    public int selectMenu_1813545() {
    	int input = 0;
    	
    	System.out.println("[Student ID: 1813545]");
    	System.out.println("1. Calculate ceil of a number");
    	System.out.println("2. Calculate floor of a number");
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter menu number: ");
    	input = scan.nextInt();

    	return input;
    }
    
    public float inputNumber_1813545() {
    	float num = 0;
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("enter a number to calculate: ");
    	num = scan.nextFloat();

    	return num;
    }
    
    public void printResult_1813545(float result) {
    	System.out.println("The result of the calculation is " + result + "\n");
    }
    
    public float calCeil_1813545(float n) {
    	if (n == (int)n) 
    		return (int)n;
    	
    	if (n >= 0) 
    		return (int)(n+1);
    	
    	else 
    		return (int)n;
    }
    
    public float calFloor_1813545(float n) {
    	if (n == (int)n)
    		return (int)n;
    	
    	if (n >= 0)
    		return (int)n;
    	
    	else 
    		return (int)(n-1);
    }
    
    public void InitialScreen_1812967() {    	
    	System.out.println("[Student ID: 1812967]");
    	System.out.println("1. Calculate maximum of numbers");
    	System.out.println("2. Calculate absolute value of a number");
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter menu number: ");
    	while(true) {
    		int Menu = sc.nextInt();
    		if(Menu == 1) {
    			int num1, num2;
    			System.out.print("Enter two integers: ");
    			num1 = sc.nextInt();
    			num2 = sc.nextInt();
    			System.out.println("The maximum is "+Max(num1, num2)+".");
    			break;    			
    		}else if(Menu==2) {
    			int num;
    			System.out.print("Enter one integer: ");
    			num = sc.nextInt();
    			System.out.println("The absolute value is "+Abs(num)+".");
    			break;
    		}else {
    			System.out.println("Select the appropriate menu.");
    			System.out.print("Enter menu number: ");
    		}
    	}
    }
    public int Max(int a, int b) {
    	if(a>=b) {
    		return a;
    	}else {
    		return b;
    	}
    }
    public int Abs(int a) {
    	if(a>=0) {
    		return a;
    	}
    	else {
    		return (-1)*a;
    	}
    }
	
     public void print_1813592_screen() {
    	Scanner scanner = new Scanner(System.in);
    	int choice;

    	System.out.println("[Student ID: 1813592]");
    	System.out.println("1. Calculate Factorial");
    	System.out.println("2. Calculate Absolute value");
    	System.out.print("Enter menu number: ");
    	choice = scanner.nextInt();
    	calculate_1813592(choice);
    }

    public void calculate_1813592(int choice) {
    	Scanner scanner = new Scanner(System.in);
    	int number;
    	
    	if(choice == 1) {
    		System.out.print("Enter the number for Factorial Calculation: ");
    		number = scanner.nextInt();
    		System.out.println("Factorial result : " + factorial_1813592(number) + '\n');
    	}
    	else if(choice == 2) {
    		System.out.print("Enter the number for Absolute Value Calculation: ");
    		number = scanner.nextInt();
    		System.out.println("Absolute Value result : " + absolutevalue_1813592(number) + '\n');
    	}
    	else {
    		System.out.println("Please choose correct menu.");
    	}
    }

    public long factorial_1813592(int number) {
    	if(number > 1) {
    		return number * factorial_1813592(number-1);
    	}
    	else {
    		return 1;
    	}
    }

    public int absolutevalue_1813592(int number) {
    	if(number == 0) {
    		return 0;
    	}
    	else if(number > 0) {
    		return number;
    	}
    	else {
    		return -number;
    	}
    }

    
    
        public void printMainScreen_1812084() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("[StudentID: 1812084]");
    	System.out.println("1. Calculate factorial");  
    	System.out.println("2. Calculate minimum value of numbers");
    	System.out.print("Enter menu number: ");
    	int menuNumber=scan.nextInt();
        
    	if(menuNumber==1) {
    		System.out.print("Enter the positive number: ");
    		long getNumber=scan.nextLong();
    		CalcFactorial(getNumber);
    		if(getNumber<0) {
    			System.out.println("Error!Enter the positive number"); 
    		}
    		else {
    			System.out.println("The value is "+CalcFactorial(getNumber));	
    		}
    	}
    	else if(menuNumber==2) {
    		System.out.print("Enter two integers: ");
    		int getNumber1 = scan.nextInt();
    		int getNumber2 = scan.nextInt();
    		CalcMinValue(getNumber1,getNumber2);
    		System.out.println("The value is "+CalcMinValue(getNumber1,getNumber2));   	
    	}
    	else {
    		System.out.println("Error!Enter the number 1 or 2");
    		System.out.println("");
    	}
    }
	
    public long CalcFactorial(long getNumber) {
    	if(getNumber>0) {
    		return getNumber*CalcFactorial(getNumber-1);
    	}
    	else if(getNumber==0||getNumber==1) {
    		getNumber=1;
    		return getNumber;
    	}
    	else  {
    		return -1;
    	}
    }
	
    public int CalcMinValue(int getNumber1,int getNumber2) {
    	if(getNumber1>getNumber2) {
    		return getNumber2;
    	}
    	else if(getNumber1==getNumber2) {
    		return getNumber1;
    	}
    	else{
    		return getNumber1;
    	}
    }
	
	public void printScreen_1812597() {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("[StudentID: 1812597]");
        System.out.println("1. Calculate Factorial");  
        System.out.println("2. Calculate Power");
        System.out.print("Enter menu(1 or 2) : ");
        int menu_num = scanner.nextInt();
        if (menu_num == 1) {
        	System.out.print("Enter factorial number(1-10) : ");
        	int factorial_num = scanner.nextInt();
        	System.out.println(factorial_num+"! = "+factorial_1812597(factorial_num));
        	System.out.println();
        }
        else if(menu_num == 2) {
        	System.out.print("Enter power number a(double), b(int): ");
        	double a = scanner.nextDouble();
        	int b = scanner.nextInt();
        	double answer = power_1812597(a, b);
        	System.out.println(a+"^"+b+" = "+String.format("%.2f", answer));
        	System.out.println();
        	
        }
	}
	
	public int factorial_1812597(int a) {
		if(a > 1) {
    		return a * factorial_1812597(a-1);
    	}
    	else {
    		return 1;
    	}
	}
	
	public double power_1812597(double a, int b) {
		double c = a;
		for (int i = 0; i < b-1; i++) {
			c = c*a;
		}
		
		return c;
	}
}
