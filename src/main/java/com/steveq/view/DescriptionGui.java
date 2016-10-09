package com.steveq.view;

import com.steveq.controller.ListController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by SteveQ on 2016-10-09.
 */
public class DescriptionGui extends JFrame {

    public DescriptionGui(String name){
        super(name);
        init();
    }

    private void init() {
        controller = ListController.getInstance();
        mainPane = new JPanel();
        description = new JTextArea();
        scrollPane = new JScrollPane(description);
        description.setLineWrap(true);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainPane.setLayout(new BorderLayout());
        mainPane.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(mainPane);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(300, 300));
    }

    private JPanel mainPane;
    public JTextArea description;
    private JScrollPane scrollPane;
    private ListController controller;
}
