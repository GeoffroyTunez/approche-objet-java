package fr.diginamic.jdr;

public class Personnage {
    int force;
    int pv;
    int score = 0;

    public Personnage(int force, int pv, int score) {
        this.force = force;
        this.pv = pv;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "force=" + force +
                ", pv=" + pv +
                ", score=" + score +
                '}';
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
