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
        this.redrawAll();
    }

    public void redrawAll() {

        GraphicsContext context = this.realCanvas.getGraphicsContext2D();
        context.fillRect(0, 0, this.getWidth(), this.getHeight());
        context.setFill(Color.WHITE);

    }

}
