class balok3 {
  	int tinggi;
  	int panjang;
  	int lebar;
}
class contoh3 {
  	public static void main(String[] args) {
    	balok3 test = new balok3();
		test.tinggi = 10;
    	test.panjang = 20;
		test.lebar = 5;		
    	hitung_volume();    
  	}   
  	public static void hitung_volume() {
        balok3 test = new balok3();
		test.tinggi = 10;
    	test.panjang = 20;
		test.lebar = 5;
		int volume;
		volume = test.panjang * test.lebar * test.tinggi;
		System.out.println("Volume = " +volume);
  	}  
}
