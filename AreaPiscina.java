class AreaPiscina{
  public static void main(String[] args){

    // calcular a area de um circulo = //! raio² * π
    double radius = 2;// raio da piscina
    double poolRadius;// area piscina

    //! 'final' define uma constante
    //  
    poolRadius =  Math.pow(radius,2) * Math.PI;
    System.out.println(poolRadius);
  }
} 