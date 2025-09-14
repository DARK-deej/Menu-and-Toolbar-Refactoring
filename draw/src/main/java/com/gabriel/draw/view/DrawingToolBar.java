package com.gabriel.draw.view;

import com.gabriel.drawfx.ActionCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class DrawingToolBar extends JToolBar {
    private JButton undoButton;
    private JButton redoButton;

    public DrawingToolBar(ActionListener actionListener) {
        this.undoButton = createButton("Undo", "com/gabriel/draw/view/images/undo.png", ActionCommand.UNDO, actionListener);
        add(this.undoButton);

        this.redoButton = createButton("Redo", "com/gabriel/draw/view/images/redo.png", ActionCommand.REDO, actionListener);
        add(this.redoButton);
        addSeparator();
        add(createButton("Line", "com/gabriel/draw/view/images/line.png", ActionCommand.LINE, actionListener));
        add(createButton("Rectangle", "com/gabriel/draw/view/images/rectangle.png", ActionCommand.RECT, actionListener));
        add(createButton("Ellipse", "com/gabriel/draw/view/images/ellipse.png", ActionCommand.ELLIPSE, actionListener));
        addSeparator();
        add(createButton("Color", "com/gabriel/draw/view/images/color.png", ActionCommand.COLOR, actionListener));
    }

    private JButton createButton(String toolTip, String imagePath, String actionCommand, ActionListener listener) {
        URL imageUrl = getClass().getClassLoader().getResource(imagePath);
        ImageIcon icon = new ImageIcon(imageUrl);
        JButton button = new JButton(icon);
        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTip);
        button.addActionListener(listener);
        return button;
    }

    public JButton getUndoButton() {
        return undoButton;
    }

    public JButton getRedoButton() {
        return redoButton;
    }
}
