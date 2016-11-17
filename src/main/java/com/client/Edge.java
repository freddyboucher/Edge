package com.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Edge implements EntryPoint {
    @Override
    public void onModuleLoad() {
        Button btn = new Button("Run it 10000x", new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                for (int i = 0; i < 10000; i++) {
                    if ("A_B_C".replace("_", "") != "ABC") {
                        Window.alert("Failed at i=" + i);
                        return;
                    }
                }
                Window.alert("All good!");
            }
        });
        RootPanel.get().add(btn);
    }
}
