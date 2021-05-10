package Modelo;

public class Producto {

    int id;
    String nom;
    double pre;
    int st;
    String est;

    public Producto() {
    }

    public Producto(int id, String nom, double pre, int st, String est) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
        this.st = st;
        this.est = est;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getSt() {
        return st;
    }

    public void setSt(int st) {
        this.st = st;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

   

}
