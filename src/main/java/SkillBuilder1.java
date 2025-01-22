import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");

        System.out.println("What's your name?");
        String Name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        float spiceValue = input.nextFloat();

        double result = (4.0 / 3.0) * Math.pow(2, Math.sqrt(5) / Math.pow(spiceValue, 3));
        System.out.println("Well " + Name + ", the spice value resulted in " + result);

        double Rounded = Math.round(result * 100.0) / 100.0;
        System.out.println("And the converted value is " + Rounded);
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();



        // TODO: Calculate and output the wall's area
        int wallArea = (int) (wallWidth * wallHeight);
        System.out.println("Wall area: " + wallArea + " square feet" );


        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double needPaint = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " +  String.format("%.2f",needPaint) + " gallons" );



        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int finalPaint = (int) Math.ceil(needPaint / gallonsPerCan);
        System.out.println("Cans needed: " + finalPaint + " can(s)");

    }
}
