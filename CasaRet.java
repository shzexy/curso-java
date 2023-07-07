 
// 	calcular a área de uma casa (e seus cômodos) de 3 cômodos: 
//	* sala: 10x10m
//	* banheiro: 5x7m
//	* quarto: 5x7m

public class CasaRet{
	public static void main(String[] args) {
		float lateral = 11;
		float cquarto = 7;
		
		float areas = lateral*lateral; // area sala
		float areaq = (lateral/2)*cquarto;// area quarto e banheiro

		float houseArea = areas + (areaq*2);
		System.out.println("CALCULO DA AREA DA CASA");
		System.out.println("AREA DA SALA: " + areas); 
		System.out.println("AREA DO QUARTO: " + areaq);
		System.out.println("AREA DO BANHEIRO: " + areaq);
		System.out.println("AREA DA CASA: " + houseArea);


	}
}





