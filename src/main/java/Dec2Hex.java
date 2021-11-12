import java.util.Scanner; //<--- dis never really used, although it is expected that it will be in future iterations.

class Dec2Hex {

	public static int Arg1;

	public static void main(String args[]) {
		if(args.length == 0){ //Can't leave the input empty, otherwise error below will show
			System.out.println("Input was either a 0 or empty, please enter a number above 0");
			return;
		}
		{
			try {
				Arg1 = Integer.parseInt(args[0]);
				if(Arg1 == 0) { //Input can't be a 0 either, since there is no point converting a 0
					System.out.println("Input was either a 0 or empty, please enter a number above 0");
					return;
				}
				else if(Arg1 <= 0){ //This sorts out negative numbers. Negative numbers in hex work in funky ways
					System.out.println("Input was either a 0 or a negative number, please enter a number above 0");
					return;
				}
			}

			catch(Exception e) { //This is for sorting out Strings. We want numbers.
				System.out.println(args[0] + " is not a valid number, please enter a number above 0");
				return;
			}

			char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int rem, num;
			num = Arg1;
			String hexadecimal="";
			System.out.println("Converting the Decimal Value " + num + " to Hex...");

			while(num != 0)  //Decimal to hexadecimal calculations + conversion
			{
				rem=num%16;
				hexadecimal= ch[rem] + hexadecimal;
				num= num/16;
			}

			System.out.println("Hexadecimal representation is: " + hexadecimal);
		}
	}
}
