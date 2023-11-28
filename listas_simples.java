public class listas_simples {
Node top;

	public boolean insertaPrimerNodo(String dato) {
		if (top == null){
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		} else {
			return false;
		}
	}

	public boolean insertaEntreNodos(String nombre, String buscando) {
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		while ((temp2 != null) && temp2.name.equals(buscando) == false) {
			temp2 = temp2.next;
		}

		if (temp2 != null) {
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		} 
		else return false;
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp;
		temp = new Node();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public Node buscarNodo(String buscando){
		Node temp = top;

		while (!temp.name.equals(buscando)){
			temp = temp.next;
		}

		return temp;
	}

	public void insertAfterFindNode (String nombre, String buscado) {
		Node temp2 = buscarNodo(buscado);

		if (top == temp2) {
			Node temp = new Node();
			temp.name = nombre;
			temp.next = temp2.next;
			temp2.next = temp;

		}
	}

	public void intercambiarNodo(String nuevo, String buscado)
    {
        Node temp3 = buscarNodo(buscado);

        if (temp3 != null)
        {
            Node temp2 = top;

            while (temp2 != null && !temp2.name.equalsIgnoreCase(buscado))
            {
                temp2 = temp2.next;
            }

            temp2.name = nuevo;
            temp2 = null;
        }
    }

    public void Imprimir()
    {
        for (Node temp = this.top; temp != null; temp = temp.next)
        {
            System.out.print(" [" + temp.name + "] ---> ");
        }
        System.out.print("[X]\n");
    }


	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next) {
			System.out.print("[" + temp.name + "] ->");
		}
		System.out.print("[X]\n");
	}
}