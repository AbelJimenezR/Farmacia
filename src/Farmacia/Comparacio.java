package Farmacia;

public class Comparacio<T,K>{
	
	private T t;
	private K k;
	
	Comparacio(T t, K k){
		this.t = t;
		this.k = k;
	}

	public boolean comparem() {
		return this.t.getClass().getName()==this.k.getClass().getName();
	}

}
