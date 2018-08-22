package com.aximo.krampton.Activity.Model;

import java.io.Serializable;

public class MainModuleModel implements Serializable {

    int module_image;
    String module_counter;
    String module_title;

    public int getModule_image() {
        return module_image;
    }

    public void setModule_image(int module_image) {
        this.module_image = module_image;
    }

    public String getModule_counter() {
        return module_counter;
    }

    public void setModule_counter(String module_counter) {
        this.module_counter = module_counter;
    }

    public String getModule_title() {
        return module_title;
    }

    public void setModule_title(String module_title) {
        this.module_title = module_title;
    }
}
