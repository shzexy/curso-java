class AreaCasa {
	static void areaCasa(float livingRoomLateral, float bedRoomLateral){

                float bedRoomArea;
                float livingRoomArea;
           	float houseArea;
		
		System.out.println("calculo para calcular a area da casa");

                livingRoomArea = livingRoomLateral * livingRoomLateral;
                System.out.println("area da sala: " + livingRoomArea);

                bedRoomArea = livingRoomLateral/2 * bedRoomLateral;
                System.out.println("area do quarto: " + bedRoomArea);
                System.out.println("area do banheiro: " + bedRoomArea);

                houseArea = bedRoomArea*2+ livingRoomArea;
                System.out.println("area da casa: " + houseArea);
	}
	static double AreaPiscina(double poolRadius){
		return Math.PI * Math.pow(poolRadius, 2);

	}
	public static void main(String[] args){

		areaCasa(11, 7);

		double poolArea = AreaPiscina(2);
		System.out.println("area da piscina: " + poolArea);
	}
}
		

