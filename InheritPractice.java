class InheritPractice {
	public static void main(String[] args){
		Top top = new Top();
		Sub sub = new Sub();
		Top topsub = new Sub();

		System.out.println("Call f1.");

		top.f1();
		sub.f1();
		topsub.f1();

		top.test();
	}
}

class Top {
	public void test(){
		Top top = new Top();
		Sub sub = new Sub();
		Top topsub = new Sub();

		System.out.println("Call f2, private function.");

		top.f2();
		sub.f2();
		topsub.f2();
	}

	public void f1(){
		System.out.println("Top#f1");
		f2();
	}
	private void f2(){
		System.out.println("Top#f2");
		f3();
	}
	public void f3(){
		System.out.println("Top#f3");
	}
}

class Sub extends Top {
	public void f1(){
		System.out.println("Sub#f1");
		f2();
	}
	public void f2(){
		System.out.println("Sub#f2");
		f3();
	}
}
