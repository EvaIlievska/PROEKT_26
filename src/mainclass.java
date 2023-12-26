
class B {
int x=2;
void triple1 () {x=x*3;}
int returnIt() {return x;}

class C extends B {
		void triple () {
			int x=2;
		x=x+3;
		}
}
 class mainclass {

	public static void main(String[] args) {
		B b=new B();
		System.out.println("b.x:"+ b.returnIt());
		C c=new C ();
		System.out.println("c.x:"+ c.returnIt());
        b.triple1();
        c.triple();
        System.out.println("b.x posle b.triple():" + b.returnIt());
        System.out.println("c.x posle c.returnIt():" + c.returnIt());
	}

}
}
