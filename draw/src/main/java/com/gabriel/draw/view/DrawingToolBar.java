package com.gabriel.draw.view;

import com.gabriel.draw.controller.ActionController;
import com.gabriel.drawfx.ActionCommand;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;

public class DrawingToolBar extends JToolBar {
    JButton undobutton;
    JButton redoButton;
    public DrawingToolBar(ActionListener actionListener){

        undobutton = new JButton();

        String imgLocation = "images/"
                + "undo"
                +".png";
        URL imageURL = DrawingToolBar.class.getResource(imgLocation);

        undobutton.setActionCommand(ActionCommand.UNDO);
        undobutton.setToolTipText("Undo");
        undobutton.addActionListener(actionListener);
        undobutton.setIcon(new ImageIcon(imageURL, "Undo"));
        undobutton.setEnabled(false);
        add(undobutton);

        redoButton = new JButton();

        imgLocation = "images/"
                + "redo"
                +".png";
        imageURL = DrawingToolBar.class.getResource(imgLocation);

        redoButton.setActionCommand(ActionCommand.REDO);
        redoButton.setToolTipText("Redo");
        redoButton.addActionListener(actionListener);
        redoButton.setIcon(new ImageIcon(imageURL, "Redo"));
        redoButton.setEnabled(false);
        add(redoButton);

        JButton button = new JButton();

        imgLocation = "images/"
                + "ellipse"
                +".png";
        imageURL = DrawingToolBar.class.getResource(imgLocation);

        button.setActionCommand(ActionCommand.ELLIPSE);
        button.setToolTipText("Ellipse");
        button.addActionListener(actionListener);
        button.setIcon(new ImageIcon(imageURL, "Ellipse"));
        add(button);

        button = new JButton();

        imgLocation = "images/"
                + "line"
                +".png";
        imageURL = DrawingToolBar.class.getResource(imgLocation);

        button.setActionCommand(ActionCommand.LINE);
        button.setToolTipText("Line");
        button.addActionListener(actionListener);
        button.setIcon(new ImageIcon(imageURL, "Line"));
        add(button);

        button = new JButton();

        imgLocation = "images/"
                + "rectangle"
                +".png";
        imageURL = DrawingToolBar.class.getResource(imgLocation);

        button.setActionCommand(ActionCommand.RECT);
        button.setToolTipText("Rectangle");
        button.addActionListener(actionListener);
        button.setIcon(new ImageIcon(imageURL, "Rectangle"));
        add(button);

        button = new JButton();

        imgLocation = "images/"
                + "color"
                +".png";
        imageURL = DrawingToolBar.class.getResource(imgLocation);

        button.setActionCommand(ActionCommand.COLOR);
        button.setToolTipText("Set Color");
        button.addActionListener(actionListener);
        button.setIcon(new ImageIcon(imageURL, "Set Color"));
        add(button);

    }
    public void setUndoEnabled(boolean enabled){
        undobutton.setEnabled(enabled);
    }
    public void setRedoButton(boolean enabled){
        redoButton.setEnabled(enabled);
    }
}