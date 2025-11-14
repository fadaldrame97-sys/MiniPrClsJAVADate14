public class Personne {

    private String nom;
    public int age;
    Passeport passeport;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;}

    public Personne() {
        nom = "fadal";
        age = 26;}

    public String setNom(String nom) {return nom;}
    public String getNom() {return nom;}}

class Passeport {
    private int NumberPasseport;
    public String nationalité;
    Personne personne;
    public int expirDate;
    public Passeport(int Numberpasseport, int expirdate,String nationalité) {
        this.NumberPasseport = Numberpasseport;
        this.expirDate = expirdate;
        this.nationalité=nationalité;}

 public void AfficherLesInformationsDeLaPersonne(Personne personne) {
        System.out.println("Affichers les informations de la personne :");
     System.out.println("Le nom est "+personne.getNom());
     System.out.println("Il a "+personne.age+" ans ");
     System.out.println("Son numéro de passeport est :"+Passeport.this.NumberPasseport);
     System.out.println("La date d'expiration de sont passeport est :"+Passeport.this.expirDate);
     System.out.println("Son pays de nationalité est :"+Passeport.this.nationalité);}
    public Passeport() {
        NumberPasseport = 2363;
        expirDate = 25032030;
        nationalité= "Senegal";}

    public int getNumberPasseport() {return NumberPasseport;}
    public int setNumberPasseport() {return NumberPasseport;}

    public static void main() {
        Personne personne = new Personne();
        Passeport passeport = new Passeport();
        passeport.AfficherLesInformationsDeLaPersonne(personne);}}



