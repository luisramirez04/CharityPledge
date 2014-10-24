/*
 * Learning Team D
 * Duane Borchick
 * Tyrone Fields
 * Patrick de los Reyes
 * Luis Ramirez
 * Java II - Programming 421
 * Liwei Jiang
 $(licensePrefix)Oct 7 - Nov 10, 2014
 */
package charitypledge;

/**
 *
 * @author patman
 */
public class CharityPledge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pledge().setVisible(true);
            }
        });
    }
    
}
