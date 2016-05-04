package com.dev.codeshere;

public class Recursion {
	public int factorial(int n) {
		  if(n == 1 || n == 2) {
		    return n;
		  }
		  return n * factorial(n-1);
		}
	
	public int bunnyEars(int bunnies) {
		   
		  if(bunnies == 0) {
		    return 0;
		  }
		 return 2 + bunnyEars(bunnies - 1);
		  
	}
	
	public int count7(int n) {
		  if( n <= 0) return 0;
		  if(n%10 == 7) {
			  return 1 + count7(n/10);
		  }
		  else {
			  return count7(n /10);
		}
		  
	}
	
	public int count8(int n) {
		  if(n <= 0) return 0;
		  if(n%100 == 88) {
			  return 2 + count8(n /10);
		  }
		  else if(n%10 == 8) {
			  return 1 + count8(n / 10);
		  }
		  else return count8(n / 10);
	}

	public int powerN(int base, int n) {
		  if(n == 1 ) return base;
		  return base * powerN(base, n -1);
		  
	}
	
	public int countX(String str) {
		  if(str.length()==0) return 0;
		  if(str.endsWith("x")) {
			  return 1 + countX(str.substring(0,str.length()-1));
		  }
		  else return countX(str.substring(0,str.length()-1));
	}
	
	public int countHi(String str) {
		  if(str.length()==0) return 0;
		  if(str.endsWith("hi")) {
			  return 1 + countHi(str.substring(0,str.length()-2));
		  }
		  else return countHi(str.substring(0,str.length()-1));
	}
	public String changeXY(String str) {
		if(str.length()==0) return "";
		
		if(str.endsWith("x")) {
			return changeXY(str.substring(0, str.length()-1)) + "y";
		}
		else {			
			return	changeXY(str.substring(0, str.length()-1)) + str.substring(str.length()-1,str.length());
		}
		
	}
	
	public String changePi(String str) {
		  if(str.length() == 0) return "";
		  if(str.endsWith("pi")) {
			  return changePi(str.substring(0, str.length()-2)) + "3.14";
		  }
		  else{
			  return changePi(str.substring(0, str.length()-1)) + str.substring(str.length()-1,str.length());
		  }
	}
	
	public String noX(String str) {
		  if (str.length() ==0) {
			return "";
		}
		  if(str.endsWith("x")) {
			  return noX(str.substring(0, str.length()-1));
		  }
		  else{
			  return noX(str.substring(0,str.length()-1)) + str.substring(str.length()-1,str.length());
		  }
	}

	
	public static void main(String[] args) {
		Recursion r = new Recursion();
//		System.out.println(r.factorial(3));
//		System.out.println(r.bunnyEars(6));
//		System.out.println(r.count7(872));
//		System.out.println(r.count8(8878));
//		System.out.println(r.powerN(3, 2));
//		System.out.println(r.countX("xxikaxx"));
//		System.out.println(r.countHi("hihihixhihiihi"));
//		System.out.println(r.changeXY("xxikaxx"));
//		System.out.println(r.changePi("piaspiasdpiipaipi"));
		
		
		System.out.println(r.noX("xxixxkaxx"));
	}
}
