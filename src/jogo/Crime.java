package jogo;

public class Crime {
    private static String criminoso, arma, local;
    
    public Crime(String criminoso, String local, String arma){
        Crime.criminoso = criminoso;
        Crime.local = local;
        Crime.arma = arma;
    }
    public Crime(){
        
    }

    public void gerarCrime(String criminoso, String local, String arma){
        Crime.criminoso = criminoso;
        Crime.local = local;
        Crime.arma = arma;
    }

    public String getCriminoso() {
        return criminoso;
    }

    public void setCriminoso(String criminoso) {
        Crime.criminoso = criminoso;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        Crime.arma = arma;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        Crime.local = local;
    }
}
