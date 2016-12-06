import java.util.Date;


public class robotNG extends robot {

    private boolean turbo ;

public boolean getturbo(){
    return turbo;

}
public void setturbo(boolean turbo ){
    this.turbo = turbo;

}
public robotNG(){
    super();
    turbo = true;

}

public robotNG (String name , position P , direction D){
    super( name ,P ,D );

}
//version #1
public void avance(int nombres_de_pats){

    for(int i=0; i<nombres_de_pats; i++ ){
        avance();
    }
}
//version #2
public void avancevers2( int nombres_de_pats){

    if (turbo){
        nombres_de_pats = nombres_de_pats * 3;
    }

    if (getD().equals(direction.Norde)){
        getP().setY( getP().getY() + nombres_de_pats );
    }

    else {
        if(getD().equals(direction.South)){
            getP().setY( getP().getY() - nombres_de_pats);
        }
    }

    if ( getD().equals(direction.East)){
         getP().setX(getP().getX() + nombres_de_pats);
    }

    else{
        if (getD().equals(direction.West)){
            getP().setX(getP().getX() - nombres_de_pats);
        }
    }

}

// version #1
public void agauche() {
    for (int i = 0; i <= 3; i++) {
        droite();
    }
}

//version #2
public void agauchevers2(){
   switch (getD()){
      case vide:
       break;
       case Norde:
           setD(direction.West);
           break;
       case East:
           setD(direction.Norde);
           break;
       case South:
           setD(direction.East);
           break;
       case West:
           setD(direction.South);
           break;

   }

}
//version 1#
public void demitour(){
        for(int i=0; i<=2; i++){
            droite();
        }
    }

//version 2#
public void demitour2(){
    switch (getD()){
        case vide:
        case Norde:
            setD(direction.South);
            break;
        case South :
            setD(direction.Norde);
            break;
    }
}
public void desactiveTurbo(){
    turbo = false ;
}
 @Override
    public void toString() {
     if (turbo) {

        super.toString() + " ----/ turbo is on /---- ";

     }
     else{

         super.toString() +  "----/ turbo is off /---";
     }

 }

}

