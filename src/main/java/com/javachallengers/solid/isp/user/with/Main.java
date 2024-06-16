package com.javachallengers.solid.isp.user.with;

public class Main {
    public static void main(String[] args) {
        ContentCreator adminCreator = new AdminUser();
        ContentEditor adminEditor = new AdminUser();
        ContentDeleter adminDeleter = new AdminUser();
        ContentPublisher adminPublisher = new AdminUser();

        ContentCreator editorCreator = new EditorUser();
        ContentEditor editorEditor = new EditorUser();

        adminCreator.createContent();
        adminEditor.editContent();
        adminDeleter.deleteContent();
        adminPublisher.publishContent();

        editorCreator.createContent();
        editorEditor.editContent();

        // Viewer user does not need to interact with content modification methods
    }
}