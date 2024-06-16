package com.javachallengers.solid.isp.user.with;

class EditorUser implements ContentCreator, ContentEditor {
    @Override
    public void createContent() {
        System.out.println("Editor creates content");
    }

    @Override
    public void editContent() {
        System.out.println("Editor edits content");
    }
}
