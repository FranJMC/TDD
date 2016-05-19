public class ArrayAsociativo {
	nodo n;

	public class nodo {
		public String clave;
		public String valor;
		public nodo sig;

		public nodo() {
			clave = null;
			valor = null;
			sig = null;
		}
	}

	public ArrayAsociativo() {
		n = new nodo();
		n.clave = null;
		n.valor = null;
	}

	public ArrayAsociativo(String c, String v) {
		n = new nodo();
		n.clave = c;
		n.valor = v;
	}

	public void put(String c, String v) {
		if (n.clave == null && n.valor == null) { // vacio
			n.clave = c;
			n.valor = v;
			n.sig = null;
		} else { // ya tiene elementos
			n.sig.clave = c;
			n.sig.valor = v;
			n.sig.sig = null;
		}
	}

	public String get(String clav) {
		nodo aux = new nodo();
		aux = n;
		while ((aux.clave != clav) || (aux.clave != null)) {
			aux = aux.sig;
		}
		return aux.valor;
	}

	public String getOrElse(String clave, String valorPorDefecto) {
		String res = valorPorDefecto;
		if (this.get(clave) != null) {
			res = this.get(clave);
		}
		return res;
	}

	public int size() {
		nodo aux = n;
		int cont = 0;
		while (aux.clave != null) {
			cont++;
		}
		return cont;
	}
	public boolean containsKey(String clave){
	  boolean res = false;
	  if(this.get(clave)!=null){
		  res = true;
	  }
	  return res;
	}

	public boolean remove(String clave) {
		boolean res = false;
		nodo ant = n;
		nodo curr = n.sig;
		if (ant.clave == clave) {
			ant.sig = null;
			res = true;
		} else {
			while ((curr.clave != clave) && (curr.clave != null)) {
				ant = ant.sig;
				curr = curr.sig;
			}
			if (curr != null) {
				curr = curr.sig;
				ant.sig = curr;
				res = true;
			}
		}
		return res;
	}
}
