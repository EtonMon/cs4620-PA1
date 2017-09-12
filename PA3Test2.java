import meggy.Meggy;

class PA3Test2{
    public static void main(String[] args){
	Meggy.setPixel((byte)2, (byte)6, Meggy.Color.VIOLET);
	
	while(true){
	    if(Meggy.checkButton(Meggy.Button.B)){ 
		    Meggy.setPixel((byte)4, (byte)4, Meggy.Color.RED);
	    }
	    if(Meggy.checkButton(Meggy.Button.A)){ 
		    Meggy.setPixel((byte)4, (byte)4, Meggy.Color.ORANGE);
	    }
	}
    }
}
