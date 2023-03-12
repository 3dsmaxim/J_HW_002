

public class HW_002 {
    public static String Filtr(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!= ' '){
                
                if (str.charAt(i) == str.toUpperCase().charAt(i)){
                    result.append(". ");
                } else if (str.charAt(i) == str.toLowerCase().charAt(i) && str.charAt(i-1) == ' '){
                    result.append(" ");
                }
                result.append(str.charAt(i));
            } 
        }
        result.delete(0, 2);
        result.append(".");
        return result.toString();

    }
       public static void main(String[] args) {
        String text = "Добрый    день Как дела Все    хорошо";
        
        System.out.println(Filtr(text));

    }

}
