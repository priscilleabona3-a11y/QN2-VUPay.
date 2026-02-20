import java.util.Scanner;

public class VUCourses {
    public static void main(String[] args) {
        // (b) Variable declarations
        String moduleCode = ""; 
        String moduleName = "";
        int tuition = 0;
        boolean found = false;

        try ( // (c) Application logic
                Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Module Code: ");
            
            if (input.hasNextLine()) {
                moduleCode = input.nextLine().toUpperCase();
            }
            
            switch (moduleCode) {
                case "BSF" -> {
                    moduleName = "BSc. Software Engineering";
                    tuition = 900000;
                    found = true;
                }
                case "BIT" -> {
                    moduleName = "BSc. Information Technology";
                    tuition = 750000;
                    found = true;
                }
                case "BCS" -> {
                    moduleName = "BSc. Computer Science";
                    tuition = 800000;
                    found = true;
                }
                case "BCE" -> {
                    moduleName = "BSc. Computer Engineering";
                    tuition = 950000;
                    found = true;
                }
                default -> {
                    System.out.println("Wrong Module Code details");
                    found = false;
                }
            }
            
            // Output results
            if (found) {
                System.out.println("Module: " + moduleName);
                System.out.println("Tuition: " + tuition);
            }
        }
    }
}