class balok4 {
    int tinggi;
    int panjang;
    int lebar;
}
class contoh4 {
    public static void main(String[] args) {
    	balok4 test = new balok4();
    	test.tinggi = 10;
    	test.panjang = 20;
	    test.lebar = 5;		
    	hitung_volume(test.tinggi, test.panjang, test.lebar);	
    }  
    public static void hitung_volume(int t, int p, int l) {	
	    int volume;
	    volume = t * p * l;
	    System.out.println("Volume = " +volume);
    }  
}