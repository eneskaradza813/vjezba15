package vjzeba15;

public class Vjzeba15 {

    public static void main(String[] args) {
        
        String str = "Ovo je recenica. Ovo je pitanje, da li je? Jeste! to je.";
        String[] wordArray = str.split("[ .,?!]");
        for(int i = 0; i < wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
    

   
        
    }

}
