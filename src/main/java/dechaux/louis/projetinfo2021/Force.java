/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

/**
 *
 * @author ldechaux01
 */
public class Force {

    protected double fx;
    protected double fy;

    public double getFx() {
        return fx;
    }

    public void setFx(double fx) {
        this.fx = fx;
    }

    public double getFy() {
        return fy;
    }

    public void setFy(double fy) {
        this.fy = fy;
    }

    public Force ajout(Force force1) {
        Force res;
        res = new Force();
        res.fx = this.fx + force1.fx;
        res.fy = this.fy + force1.fy;
        return res;
    }

    public Force appui() {
        this.fx = 0;
        this.fy = 0;
        return this;
    }
    public Force() {
        this.fx = 0.0;
        this.fy = 0.0;
    }
    public String toString() {
        return "force de x : " + this.fx + "\n force de y :" + this.fy;
    }
}
