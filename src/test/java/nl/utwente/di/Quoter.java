package nl.utwente.di;

public class Quoter {
	public int getBookPrice(String string){
		if(string.equals("1")){
			return 10;
		}else if(string.equals("2")){
			return 45;
		}else if(string.equals("3")){
			return 20;
		}else if(string.equals("4")){
			return 35;
		}else if(string.equals("5")){
			return 50;
		}else{
			return 0;
		}
	}
}
