
public class position {

    // attributs //

    private double x ;
    private double y ;

public position (double x,double y){

    this.x = x ;
    this.y = y ;
}

public double getX(){
    return x ;
}
public double getY(){
    return y;
}
public void setX(double x){
    this.x = x ;
}
public void setY(double y){
    this.y = y;
}

//tostring methodes//

public String toString (){
    return String.format("%f/%f", x , y);
}
}
