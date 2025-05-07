public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        StringBuilder cleaned = new StringBuilder();
        for(int i=0 ; i<s.length(); i++ ){
            char ch = s.charAt(i) ;
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(Character.toLowerCase(ch)) ;
            }
        }
        StringBuilder reversed = new StringBuilder(cleaned).reverse() ;
        return cleaned.toString().equals(reversed.toString()) ;



    }

    public static void main(String[] args) {
        String s = "race car" ;
        System.out.println(isPalindrome(s));
    }
}

