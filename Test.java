
/**
 *
 * @author TestUser
 */
public class Test {

    public static void main(String[] args) {
        CrayonBox crayola = new CrayonBox();
        CareTaker toddler = new CareTaker(crayola);

        //Lets add some crayons to the box
        Crayon one = new Crayon("Red");
        toddler.addCrayon(one);

        Crayon two = new Crayon("Blue");
        toddler.addCrayon(two);

        Crayon three = new Crayon("Green");
        toddler.addCrayon(three);

        Crayon four = new Crayon("Yellow");
        toddler.addCrayon(four);

        Crayon five = new Crayon("magenta");
        toddler.addCrayon(five);

        //now the crayons will be used randomly
        toddler.useCrayon(one);
        toddler.useCrayon(two);
        toddler.useCrayon(three);
        toddler.useCrayon(one);
        toddler.useCrayon(five);
        toddler.useCrayon(three);
        
        System.out.println(crayola.toString());

    }
}
