
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valentinwendling
 */
public class ObjetBougeant {
    private String nom;
    private Integer x;
    private Integer y;
    private Double r;
    private Double DELTA_R = 5.0;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String getNom() {
        return nom;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Double getR() {
        return r;
    }

    public Double getDELTA_R() {
        return DELTA_R;
    }
    
    

    @Override
    public String toString() {
        return "ObjetBougeant{" + "nom=" + nom + ", x=" + x + ", y=" + y + ", r=" + r + '}';
    }
    
    public void deplace(Integer dx, Integer dy) {
        this.x = getX() + dx;
        this.y = getY() + dy;
    }
    
    public boolean estPoint() {
        return this.r.equals(0.0);
    }
    
    public void grossir() {
        this.r = this.r + this.DELTA_R;
    }
    
    public void retrecir() {
        this.r = this.r - this.DELTA_R;
    }
    
    public void grossir(Double delta) {
        this.DELTA_R = this.DELTA_R + delta;
    }
    
    public void retrecir(Double delta) {
        this.DELTA_R = this.DELTA_R - delta;
    }
    
    private boolean collision(ObjetBougeant that) {
        return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.x - that.x), 2)) < this.r + that.r;
    }
    
    public void absorbe(ObjetBougeant that) {
        if (this.collision(that)) {
            this.x = this.x + that.x;
            this.y = this.y + that.y;
            that.x = 0;
            that.y = 0;
        }
    }
    
    public void estAbsorbe(ObjetBougeant that) {
        if (this.collision(that)) {
            that.x = that.x + this.x;
            that.y = that.y + this.y;
            this.x = 0;
            this.y = 0;
        }
    }
    
    public ObjetBougeant pond() {
        ObjetBougeant oeuf = new ObjetBougeant();
        oeuf.setX(0);
        oeuf.setY(0);
        oeuf.setR(this.r / 2);
        return oeuf;
    }
    
    public ObjetBougeant pond(ObjetBougeant that) {
        ObjetBougeant oeuf = new ObjetBougeant();
        oeuf.setX(this.x + that.x);
        oeuf.setY(this.y + that.y);
        oeuf.setR(this.r / 2);
        return oeuf;
    }
}
