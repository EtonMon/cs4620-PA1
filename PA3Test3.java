import meggy.Meggy;

class PA3Test3{
    public static void main(String[] args){
	Meggy.setPixel((byte)2, (byte)6, Meggy.Color.VIOLET);
	
	while(true){
	    if(Meggy.checkButton(Meggy.Button.A)){ 
		Meggy.setPixel((byte)4, (byte)4, Meggy.Color.ORANGE);
		Meggy.delay(500);
	    }else if(Meggy.getPixel((byte)4,(byte)4)==Meggy.Color.ORANGE){
		Meggy.setPixel((byte)4, (byte)4, Meggy.Color.VIOLET);
	    }
	}
    }
}
