public class FakeBinary {
    public static String fakeBin(String numberString) {
        	
        int aux = 0;
        
        StringBuffer cadenaout = new StringBuffer();
        
		    for(int x = 0;x<numberString.length();x++) {
		
			      aux = Integer.parseInt(numberString.substring(x,x+1));
			
			      if (aux < 5)
			      {
				       cadenaout.append("0");
			      }
			      else
			      {
				       cadenaout.append("1");				
			      }
		    }
		
		    System.out.print(cadenaout);

        
        return cadenaout.toString();
    }
}