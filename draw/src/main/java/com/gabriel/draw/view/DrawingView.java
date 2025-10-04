package com.gabriel.draw.view;

import com.gabriel.draw.controller.DrawingController;
import com.gabriel.draw.controller.DrawingWindowController;
import com.gabriel.drawfx.model.Drawing;
import com.gabriel.drawfx.model.Shape;
import com.gabriel.drawfx.service.AppService;

import javax.swing.*;
import java.awt.*;

public class DrawingView extends JPanel {
    AppService appService;

    public DrawingView(AppService appService){

        this.appService = appService;
        appService.setView(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Drawing drawing = (Drawing) appService.getModel();
        if(drawing != null){
            for(Shape shape : drawing.getShapes()){
                if (shape.getRendererService() != null){
                    shape.getRendererService().render(g, shape, false);
                }
            }
        }
    }
}
