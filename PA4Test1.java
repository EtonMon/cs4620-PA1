import meggy.Meggy;

class PA4Test1{
    public static void main(String[] args){
	Meggy.setPixel((byte)2, (byte)6, Meggy.Color.VIOLET);
	
	while(true){
	    if(Meggy.checkButton(Meggy.Button.A)){ 
		new Something().reddot((byte)1,(byte)1);
	    }
	}
    }
}

class Something{
    public void reddot(byte x, byte y){
	Meggy.setPixel(x,y,Meggy.Color.RED);
    }
}
