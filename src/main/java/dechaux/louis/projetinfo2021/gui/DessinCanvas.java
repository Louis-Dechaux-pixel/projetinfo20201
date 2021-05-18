/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author ldenner01
 */
public class DessinCanvas extends Pane {

    private Canvas realCanvas;

    public DessinCanvas() {

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
        this.redrawAll();
    }

    public void redrawAll() {

        GraphicsContext context = this.realCanvas.getGraphicsContext2D();
        context.fillRect(0, 0, this.getWidth(), this.getHeight());
        context.setFill(Color.WHITE);

    }

}
