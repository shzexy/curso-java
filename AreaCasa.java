class AreaCasa {
	//! FORA DE QUALQUER ESCOPO
	static double valorM2 = 1500;

	static double value(double area) {
		if (area >= 0)
			return valorM2 * area;
		return -1;
	}

	//! CALCULO DE AREA DA CASA
	static void areaCasa(float livingRoomLateral, float bedRoomLateral) {

		System.out.println("calculo para calcular a area da casa\n");

		if (livingRoomLateral < 0 || bedRoomLateral < 0) {
			System.out.println("Erro: parametro menor que zero");
		} else {
			float livingRoomArea = livingRoomLateral * livingRoomLateral;
			System.out.println("area da sala: " + livingRoomArea);

			float bedRoomArea = livingRoomLateral / 2 * bedRoomLateral;
			System.out.println("area do quarto: " + bedRoomArea);
			System.out.println("area do banheiro: " + bedRoomArea);
float houseArea = bedRoomArea * 2 + livingRoomArea;
			System.out.println("area da casa: " + houseArea);

		}
	}

	//! CALCULO DE AREA DA PISCINA
	static double AreaPiscina(double poolRadius) {
		return ((poolRadius >= 0) ? Math.PI * Math.pow(poolRadius, 2) : -1);
	}

	static final int ALVENARIA = 0;
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;

	//! CALCULO DE VALOR DA PISCINA
	static double poolValue(double area, int material) {
		switch (material) {
			case ALVENARIA:
				return area * 1500;
			case VINIL:
				return area * 1100;
			case FIBRA:
				return area * 750;
			case PLASTICO:
				return area * 500;
			default:
				return -1;
		 
	}
	static double[] price = {1500, 1100, 750, 500};

	//! PRINCIPAL
	public static void main(String[] args) {
	/*
	areaCasa(11, 7);
	double poolArea = AreaPiscina(2);
	boolean poolOK = poolArea>0;
	if (poolOK) System.out.println("area da piscina: " + poolArea);
	else System.out.println("valor de area da piscina negativo");

	double price = value(50);
	boolean valorOK = price>0;
	if (valorOK) System.out.println("o valor da construção sera: " + price);
	else System.out.println("valor de area negativo");

	*/
    	System.out.println("Area\tMateria\tValor");
    	for(double area = 50; area<=200; area+=50){
			for(int type = ALVENARIA; type <= PLASTICO; type++){
				System.out.println(area+"\t"+type+"\t"+poolValue(area,type));
			}

	}
}
