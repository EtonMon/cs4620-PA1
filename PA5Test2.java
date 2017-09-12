import meggy.Meggy;

class PA5Test2{
    public static void main(String[] args){
	Meggy.setPixel((byte)2, (byte)6, Meggy.Color.VIOLET);
        
	
	while(true){
	    if(Meggy.checkButton(Meggy.Button.A)){ 
	        Meggy.setPixel((byte)1,(byte)1, new Something().getColor());
	    }else{
		Meggy.setPixel((byte)1,(byte)1, Meggy.Color.BLUE);
	    }
	}
    }
}

class Something{
    Meggy.Color color;

    public Meggy.Color getColor(){
	color = Meggy.Color.RED;
	return color;
    }
}
