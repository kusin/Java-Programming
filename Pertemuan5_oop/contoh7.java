class balok7 {
    int tinggi;
    int panjang;
    int lebar;
  
    void hitung_volume(int t, int p, int l){
	    int volume;
	    volume = t * p * l;
	    System.out.println("Volume = " +volume);
    }
}

class contoh7 {
    public static void main(String[] args) {
    	balok7 test = new balok7();
	    test.tinggi = 10;
    	test.panjang = 20;
    	test.lebar = 5;		
    	test.hitung_volume(test.tinggi,test.panjang,test.lebar);	
    }
}
