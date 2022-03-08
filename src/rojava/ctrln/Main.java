package rojava.ctrln;


public class Main {

    /**
     * Metoda Main este metoda apelata de masina virtuala Java si care porneste o aplicatie Java.
     * Putem sa transmitem argumente aditionale prin parametrul <b>args</b>.
     * @param args Acesta este parametrul cu care transmitem argumente programului nostru.
     *  @author     Via Via
     */

    public static void main(String[] args) {
if (args.length!= 4){
    System.out.println ("USAGE: java rojava.ctrln.Main 1 2 3 4");
    return;
}
    if (args[0].equals("1")){
        System.out.println ("Ar trebui sa am un singur mesaj!");

        }
	    System.out.println("Invat limbajul Java si despre masina virtuala!");
        rojava.misc.Main.main(args);
    }
}
