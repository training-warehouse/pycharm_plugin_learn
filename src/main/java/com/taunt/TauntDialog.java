package com.taunt;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TauntDialog extends DialogWrapper {
    private JLabel label;

    protected TauntDialog(){
        super(true);
        setTitle("每天一碗毒鸡汤");
        init();
    }

    @NotNull
    @Override
    protected JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        label = new JLabel(ContentUtils.getContent());
        panel.add(label);

        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("再干一碗");
        button.addActionListener(e -> {
            String content = ContentUtils.getContent();
            label.setText(content);
        });
        panel.add(button);

        return panel;
    }
}
