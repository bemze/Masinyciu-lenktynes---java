package masinyciu.lenktynes;

public class Masina {

    private String pavadinimas;
    private int kelias;
    private int maxGreitis;
    private int greitis;

    public Masina(String pavadinimas, int maxGreitis) {
        this.pavadinimas = pavadinimas;
        this.kelias = 0;
        this.maxGreitis = maxGreitis;
        this.greitis = 0;
    }

//    jei sportine masina - 50%, pasikeis spolerio pozicija
    public void gazuok(int kiek) {
        this.greitis += kiek;
        if (this.greitis > this.maxGreitis) {
            this.greitis = this.maxGreitis;
        }

    }

//    jei spoileris pakeltas 2x greiciau stabdo
    public void stabdyk(int kiek) {

        this.greitis -= kiek;
        if (this.greitis < 0) {
            this.greitis = 0;
        }

    }

    public void vaziuok() {//this rodo i objekta per kuri jis buvo iskviestas
        this.kelias += this.greitis;

    }

    @Override
    public String toString() {
        return pavadinimas+"."  + " Nuvaziavo " + kelias + " km";
    }

//    public void nuspreskKaDaryt(){ 
//        double mr = Math.random();
//        if (mr <=0.2) {
//            this.vaziuok();
//        }
//        if (mr >0.2 && mr >= 0.5 ) {
//           this.stabdyk();
//        }
//        if (mr > 0.5) {
//           this.gazuok();
//        }   
//    }
    public int getKelias() {
        return kelias;
    }

    public String getName() {
        return this.pavadinimas;
    }

}

// 30% masina gazuos;
//50% - gazuos;
//20% - nekeis greicio;
