import java.util.ArrayList;
public class Instructeur {
    public int Id;
    public String nom;
    public String Specialisation;
    ArrayList<Cours> Listecourses=new ArrayList<>();
public Instructeur(int Id, String nom, String Specialisation) {
    this.Id=Id;
    this.nom=nom;
    this.Specialisation=Specialisation;}
public Instructeur() {
    Id=25;
    nom="MOUHAMADOU FADAL";
    Specialisation=" INFOMATIQUE";}
public void AjouterCours(Cours cours){
Listecourses.add(cours);}
public void AfficherCours(Cours cours){
    for(Cours c:Listecourses){
        System.out.println(c);
    }}}
class Cours{
    public int Id;
    public String titre;
    public String Description;
     Instructeur instructeur=new Instructeur();
    public Cours(int Id, String titre, String Description) {
        this.Id=Id;
        this.titre=titre;
        this.Description=Description;}
    public Cours() {
        Id=37;
        titre="JavaScript";
        Description="Notion de de Bases";}
    @Override
    public String toString(){
        return Id+","+titre+","+Description;
    }}
       public void main() {
       Instructeur instructeur=new Instructeur ();
       Cours cours=new Cours();
            Cours cours1=new Cours();
            Cours cours2=new Cours();
            Cours cours3=new Cours();
            Cours cours4=new Cours();
       instructeur.AjouterCours(cours1);
            instructeur.AjouterCours(cours2);
            instructeur.AjouterCours(cours3);
            instructeur.AjouterCours(cours4);
            instructeur.AjouterCours(cours);
       instructeur.AfficherCours(cours);


        }