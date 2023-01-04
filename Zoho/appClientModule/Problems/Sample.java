package Problems;

public class Sample {

	public static void main(String[] args)
	{
		// Using Console to input data from user
		if (args.length > 0) {
			System.out.println(
					"The command line arguments are:");

			// iterating the args array and printing
			// the command line arguments
			for (String val : args)
				System.out.println(val);
		}
		else {
			System.out.println("No command line "
					+ "arguments found.");
		}
		System.out.println("enter input ");
		String input = System.console().readLine();
		System.out.println("input is - "+input);
	}

}
