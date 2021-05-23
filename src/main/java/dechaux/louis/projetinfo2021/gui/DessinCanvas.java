/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


/**
 *
 * @author ldenner01
 */
public class DessinCanvas extends Pane {
    
    protected TreilliPane main;

    private Canvas realCanvas;

    public DessinCanvas(TreilliPane main) {
        this.main = main;
        this.realCanvas = new Canvas(this.getWidth(), this.getHeight());
        this.getChildren().add(this.realCanvas);
        this.realCanvas.heightProperty().bind(this.heightProperty());
        this.realCanvas.heightProperty().addListener((o) -> {
            this.redrawAll();
        });
        this.realCanvas.widthProperty().bind(this.widthProperty());
        this.realCanvas.widthProperty().addListener((o) -> {
            this.redrawAll();
        });
        this.realCanvas.setOnMouseClicked((t) -> {
            Controleur control = this.main.getControleur();
        control.clicDansZoneDessin(t);
    });
        this.redrawAll();
    }

    public void redrawAll() {
        GraphicsContext context = this.realCanvas.getGraphicsContext2D();
        context.setFill(Color.WHITE);
        context.fillRect(0,50, this.getWidth(), this.getHeight()-100);
        Treilli treilli = this.main.getTreilli();
    }
    public void drawNoeud(Noeud noeud) {
        GraphicsContext context = this.realCanvas.getGraphicsContext2D();
        context.fillOval(noeud.getPx()-2.5, noeud.getPy()-2.5, 2*5, 2*5);
    }

}
    


