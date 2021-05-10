package Modelo;

public class Cliente {

    int id;
    String dni;
    String nom;
    String direc;
    String tel;
    String esta;

    public Cliente() {
    }

    public Cliente(int id, String dni, String nom, String direc, String tel, String esta) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.direc = direc;
        this.tel = tel;
        this.esta = esta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEsta() {
        return esta;
    }

    public void setEsta(String esta) {
        this.esta = esta;
    }

    

}
