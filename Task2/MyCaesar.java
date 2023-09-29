package Task2;

public class MyCaesar {
	 public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 
			    'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
			    
			    private int n; // số bước dịch chuyển (dịch phải)
			    
			    public MyCaesar(int shiftSteps) {
			        this.n = shiftSteps;
			    }
			    
			 // Mã hóa một ký tự theo các bước dịch chuyển đã cho.
			 // Mã hóa: En(x) = (x + n) mod 26. x đại diện cho chỉ số của c trong mảng ALPHABET.
			    public char encryptChar(char c) {
			        if (!Character.isLetter(c)) {
			            return c; // Trả về các ký tự không phải chữ cái

			        }
			        
			        char upperCaseChar = Character.toUpperCase(c);
			        int index = (upperCaseChar - 'A' + n) % 26; // Lấy chỉ số sau khi dịch chuyển
			        return ALPHABET[index];
			    }
			    
			 // Mã hóa văn bản bằng hàm trên để mã hóa ký tự.
			    public String encrypt(String input) {
			        StringBuilder encryptedString = new StringBuilder();
			        for (char c : input.toCharArray()) {
			            encryptedString.append(encryptChar(c));
			        }
			        return encryptedString.toString();
			    }
			    
			 // Giải mã một ký tự theo các bước dịch chuyển đã cho.
			 // Giải mã: Dn(x) = (x - n) mod 26. x đại diện cho chỉ số của c trong mảng ALPHABET.
			    public char decryptChar(char c) {
			        if (!Character.isLetter(c)) {
			            return c; // Trả về các ký tự không phải chữ cái
			        }
			        
			        char upperCaseChar = Character.toUpperCase(c);
			        int index = (upperCaseChar - 'A' - n + 26) % 26; // Lấy chỉ mục gốc bằng cách đảo ngược ca
			        return ALPHABET[index];
			    }
			    
			 // Giải mã văn bản được mã hóa bằng hàm trên để giải mã một ký tự.
			    public String decrypt(String input) {
			        StringBuilder decryptedString = new StringBuilder();
			        for (char c : input.toCharArray()) {
			            decryptedString.append(decryptChar(c));
			        }
			        return decryptedString.toString();
			    }
	 public static void main(String[] args) {
		 MyCaesar caesar = new MyCaesar(3); 
	        
	  
	        char encryptedChar = caesar.encryptChar('A');
	        System.out.println(encryptedChar); 
	        
	       
	        char decryptedChar = caesar.decryptChar('D');
	        System.out.println(decryptedChar);
	        
	    
	        String encryptedText = caesar.encrypt("HELLO");
	        System.out.println(encryptedText); 
	        
	      
	        String decryptedText = caesar.decrypt("KHOOR");
	        System.out.println(decryptedText); 
	    }	
	}

	