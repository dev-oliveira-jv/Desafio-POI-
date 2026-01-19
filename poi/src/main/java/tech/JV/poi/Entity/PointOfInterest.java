package tech.JV.poi.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_poi")
public class PointOfInterest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;



    private long x;

    

    private long y;

    public PointOfInterest() {

    }

    public PointOfInterest(String name, long x, long y){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }
}
