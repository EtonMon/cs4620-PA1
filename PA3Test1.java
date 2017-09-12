import meggy.Meggy;

class PA3Test1{
    public static void main(String[] args){
	while(true){
	    Meggy.setPixel((byte)4, (byte)4, Meggy.Color.RED);
	    Meggy.delay(1000);
	}
    }
}
