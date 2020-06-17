package Composition;

public class Dog {
    private String nose;
    private String eyes;
    private String hair;
    private Muzzle muzzle;

    public Dog(String nose, String eyes, String hair, Muzzle muzzle) {
        this.nose = nose;
        this.eyes = eyes;
        this.hair = hair;
        this.muzzle = muzzle;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }
}
