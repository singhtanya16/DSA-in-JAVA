public class Clear_bit {
    public static void main (String [] args ){
        int n = 5 ; 
        int pos = 2;
        int bitmask = 1<<pos ;
        int newnNumber = ~(bitmask) &n ;
        System.out.print (newnNumber); 
    }
}
