interface I1{
	int id=99;
}
interface I2 extends I1{
	
}
class InterfaceEx implements I1,I2{
public static void main(String[] args){
	System.out.println("Value of id:"+I1.id);
}
}