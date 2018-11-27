class threads extends Thread{
	synchronized void print1(){
		for(int i=1;i<=1000;i++){
			System.out.println("t1 "+i);
		}
	}
		synchronized void print2(){
		for(int i=1;i<=1000;i++){
			System.out.println("t2 "+i);
		}
		}
	 public static void main(String[] args){
		 //Thread t= new Thread();
		 threads t1=new threads();
		 threads t2=new threads();
		 t1.print1();
		 t2.print2();
		 
	 }
	
}