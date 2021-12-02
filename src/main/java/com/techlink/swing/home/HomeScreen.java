/*
 * Copyright (c) 2021 Dipesh Shrestha aka JustaDreamer
 * Github: https://github.com/JustaNormalDreamer
 */

package com.techlink.swing.home;

import com.techlink.swing.auth.LoginForm;
import com.techlink.swing.auth.RegisterForm;
import com.techlink.swing.students.StudentTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame implements ActionListener {

    private final Container container;
    private final JButton loginButton, registerButton, studentButton;

    public HomeScreen() {

        container = getContentPane();

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(200, 100, 100, 30);
        registerButton.addActionListener(this);
        container.add(registerButton);

        studentButton = new JButton("Students");
        studentButton.setBounds(300, 100, 100, 30);
        studentButton.addActionListener(this);
        container.add(studentButton);

        setLayout(null);
        setSize(500, 800);
        setTitle("Home");
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#DBDBDB"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (loginButton.equals(source)) {
            new LoginForm();
        } else if (registerButton.equals(source)) {
            new RegisterForm();
        } else if (studentButton.equals(source)) {
            new StudentTable();
        }
    }
}