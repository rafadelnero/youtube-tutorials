package com.javachallengers.solid.isp.user.without;

public class Main {
    public static void main(String[] args) {
        User admin = new AdminUser();
        User editor = new EditorUser();
        User viewer = new ViewerUser();

        admin.createContent();
        admin.editContent();
        admin.deleteContent();
        admin.publishContent();

        editor.createContent();
        editor.editContent();
        // These methods do nothing meaningful
        editor.deleteContent();
        editor.publishContent();

        // Viewer user has no meaningful methods to call
    }
}