public class UsarMetodos {
	public static void main(String[] args) {
		listas_simples lista = new listas_simples();

		lista.insertaPrimerNodo("H");
		lista.insertaAlFinal("Y");
		lista.insertaAlFinal("Z");
		lista.insertaAlFinal("B");
		lista.insertaAlFinal("C");
		lista.insertaAlFinal("D");
		lista.buscarNodo("B");
		lista.insertAfterFindNode("M", "B");
		lista.intercambiarNodo("V", "D");
		lista.imprimir();
	}
}