package jogo;
import telas.TelaJogo;

    public class Jogo {
        Crime c = new Crime();
        TelaJogo tj = new TelaJogo();
        
        public String darPalpite(String suspeito, String local, String arma){
            String temp = "";
            if (!c.getCriminoso().equals(suspeito)){
               temp +=(suspeito + " não é o criminoso.\n");
            }
            else{
                temp += (suspeito + " é o criminoso.\n");
            }    
            if (!c.getLocal().equals(local)){
                temp += (local + " não é o local do crime.\n");
            }
            else{
                temp += (local + " é o local do crime\n");
            }
            if (!c.getArma().equals(arma)){
                temp += (arma + " não é a arma do crime.\n");
            }
            else{
                temp += (arma + " é a arma do crime.\n");
            }
            return temp;
        }
        public boolean acusar(String suspeito, String local, String arma){
           return c.getCriminoso().equals(suspeito)&& c.getLocal().equals(local)
                   && c.getArma().equals(arma);
        }
}
