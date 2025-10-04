package com.gabriel.draw.view;

import com.gabriel.drawfx.ActionCommand;
import com.gabriel.drawfx.ShapeMode;
import com.gabriel.drawfx.command.CommandService;
import com.gabriel.drawfx.service.AppService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class DrawingMenuBar extends JMenuBar {

    public DrawingMenuBar( ActionListener actionListener ){
        super();
        JMenuItem lineMenuItem = new JMenuItem("Line");
        lineMenuItem.setActionCommand(ActionCommand.LINE);
        JMenuItem rectangleMenuItem = new JMenuItem("Rectangle");
        rectangleMenuItem.setActionCommand(ActionCommand.RECT);
        JMenuItem ellipseMenuItem = new JMenuItem("Ellipse");
        ellipseMenuItem.setActionCommand(ActionCommand.ELLIPSE);

        JMenuItem undoMenuItem = new JMenuItem("Undo");
        undoMenuItem.setActionCommand(ActionCommand.UNDO);
        JMenuItem redoMenuItem = new JMenuItem("Redo");
        redoMenuItem.setActionCommand(ActionCommand.REDO);
        JMenuItem colorMenuItem = new JMenuItem("Color");
        colorMenuItem.setActionCommand(ActionCommand.COLOR);

        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        add(editMenu);
        undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
        undoMenuItem.addActionListener(actionListener);
        undoMenuItem.setActionCommand(ActionCommand.UNDO);
        editMenu.add(undoMenuItem);
        redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));;
        redoMenuItem.addActionListener(actionListener);
        editMenu.add(redoMenuItem);

        JMenu drawMenu = new JMenu("Draw");
        drawMenu.setMnemonic(KeyEvent.VK_D);
        editMenu.add(drawMenu);
        drawMenu.add(lineMenuItem);
        lineMenuItem.setActionCommand(ActionCommand.LINE);
        lineMenuItem.addActionListener(actionListener);
        drawMenu.add(rectangleMenuItem);
        rectangleMenuItem.addActionListener(actionListener);
        drawMenu.add(ellipseMenuItem);
        ellipseMenuItem.addActionListener(actionListener);

        JMenu propMenu = new JMenu("Properties");
        propMenu.setMnemonic(KeyEvent.VK_P);
        propMenu.add(colorMenuItem);
        this.add(propMenu);
        colorMenuItem.setActionCommand(ActionCommand.COLOR);
        colorMenuItem.addActionListener(actionListener);

    }
}

