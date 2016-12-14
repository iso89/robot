/**
 * Created by macbook on 16-11-27.
 */
public class robot{

    // attributs

    private String name;
    private position P;
    private direction D;

    // renisialisation

public robot (){
    this.name = "vide";
    this.P = new position;
    this.D = direction.vide;
}

// constructeur
// constructeur avec un argument en chaine de caractères manquant 
public robot (String nom, position P , direction D){
    this.name = "nom";
    this.P = P;
    this.D = D;

}

public String getname(){
    return name ;
}

public position getP(){
    return P;
}

public direction getD(){
    return D;
}

public void setP (position P){
    this.P = P;
}

public void setD (direction D){
    this.D = D;
}

// methode avance/droite  //

public void avance(){
    if (D.equals(direction.Norde)){             // si D = direction.norde //
        P.setY(P.getY() + 1);

    }

    else {
        if (D.equals(direction.South)){
            P.setY(P.getY() - 1);

        }
     if (D.equals(direction.East)){
             P.setX(P.getX() + 1);

     }
     else {
         if (P.equals(direction.West)) {
             P.setX(P.getX() - 1);

         }
     }

    }
}

public void droite() {
    switch (D) {
        case vide:
            break;
        case Norde:
            D = direction.East;
            break;
        case East:
            D = direction.South;
            break;
        case South:
            D = direction.West;
            break;
        case West:
            D = direction.Norde;
            break;
    }
}

public void affiche (){

 System.out.println( " le rebot " + name + " est dans la position suivante: "+"("+P+ ")"+"\n est la direction: "+"("+D+ ")");

    }


}


