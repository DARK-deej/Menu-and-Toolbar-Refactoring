package com.gabriel.draw.view;

import com.gabriel.draw.controller.DrawingWindowController;
import com.gabriel.drawfx.service.AppService;

import javax.swing.*;

public class DrawingFrame extends JFrame {
    private DrawingView drawingView;

    public DrawingFrame(AppService appService){
        DrawingWindowController drawingWindowController = new DrawingWindowController(appService);
        this.addWindowListener(drawingWindowController);
        this.addWindowFocusListener(drawingWindowController);
        this.addWindowStateListener(drawingWindowController);

        this.drawingView = new DrawingView(appService); //changed
        this.getContentPane().add(drawingView);
    }
    public DrawingView getDrawingView(){
        return this.drawingView;
    }
}
