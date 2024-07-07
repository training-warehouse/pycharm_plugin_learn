package com.taunt;

import com.intellij.openapi.components.ApplicationComponent;

public class MyApplicationComponent implements ApplicationComponent {
    @Override
    public void initComponent() {
        System.out.println("MyApplicationComponent initComponent");
        TauntDialog dialog = new TauntDialog();
        dialog.show();
    }
}

