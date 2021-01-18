
package masinyciu.lenktynes;


public class SportineMasina extends Masina {
    private boolean spoileris;

    public SportineMasina(String pavadinimas, int maxGreitis) {
        super(pavadinimas, maxGreitis);
        this.spoileris = false;
    }
 public void pakeltiSpoileri() {
     this.spoileris = !this.spoileris;
 }
 public void gazuok(int kiek){
     if (!this.spoileris) {
         super.gazuok(kiek * 2);
     } else {
         super.gazuok(kiek);
     }
 }
 public void stabdyk(int kiek){
     if (!this.spoileris) {
         super.stabdyk(kiek * 2);
     } else {
         super.gazuok(kiek);
     }
 }
 
 public String toString() {
     return "Sportine" + super.toString();
 }
    //jei poileris pakeltas - true
    // jei spoileris nuleistas - false
    
    
//    jei spoileris nuleistas - 2x greiciau gazuoja
//     jei spoileris pakeltas -   gazuoja kaip standartine
}

