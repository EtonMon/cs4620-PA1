import meggy.Meggy;

class PA4Test3{
    public static void main(String[] args){
	Meggy.setPixel((byte)2, (byte)6, Meggy.Color.VIOLET);
	
	while(true){
	    if(1<2 && Meggy.checkButton(Meggy.Button.A)){ 
	        Meggy.toneStart(Meggy.Tone.C3, 100);
	    }
	}
    }
}
