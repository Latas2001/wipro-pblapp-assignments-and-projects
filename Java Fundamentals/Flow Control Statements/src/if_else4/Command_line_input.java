package if_else4;

public class Command_line_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
            System.out.println("The command line"
                               + " arguments are:");
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");

	}

}
