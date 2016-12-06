 import java.util.ArrayList;

public class main {
    public static void main (String[] args){

                ArrayList<robot> listeRobot = new ArrayList<>();

                //creation des robot
                robot robot1 = new robot("ZZ-x3");
                robot robot2 = new robot("b-18", new position(), direction.Norde();
                robotNG robot = new robotNG("c18");
                robotNG robot12 = new robotNG("ZZ-65x", new position(1, 2), direction.East();


                //l'ajout des element
                listeRobot.add(robot1);
                listeRobot.add(robot2);
                listeRobot.add(robot);
                listeRobot.add(robot12);


                //les methodes
                robot1.avance();

                robot2.droite();

                robot.desactiveTurbo();
                robot.avance(34);

                robot12.demitour2();

                //l'affichage

                for (int i = 0; i < listeRobot.size(); i++) {
                    System.out.println(listeRobot.get(i));
                }

            }
        }
    }
}
