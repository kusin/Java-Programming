class balok2 {
	// inisialisasi attribut
  	int tinggi;
  	int panjang;
  	int lebar;
}

class contoh2 {
  	public static void main(String[] args) {
    	balok2 test = new balok2();
		test.tinggi = 10;
    	test.panjang = 20;
		test.lebar = 5;

		int volume;
		volume = test.tinggi * test.panjang * test.lebar;
		System.out.println("Tinggi = " +test.tinggi);
		System.out.println("Panjang = " +test.panjang);
		System.out.println("Lebar = " +test.lebar);
		System.out.println("Volume = " +volume);
  	}	
}
