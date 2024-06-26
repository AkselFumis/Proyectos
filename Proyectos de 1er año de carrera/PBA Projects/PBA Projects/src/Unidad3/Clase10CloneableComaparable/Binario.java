package Unidad3.Clase10CloneableComaparable;

public class Binario implements Cloneable {

    private String s1,s2,s3,s4;

    public Binario(String s1, String s2, String s3, String s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    @Override
    public String toString() {
        return s1+s2+s3+s4;
    }
    
    

    @Override
    public Binario clone() {
        Binario clon = new Binario(this.s1, this.s2,this.s3,this.s4);
        return clon;
    }
    
    

}
