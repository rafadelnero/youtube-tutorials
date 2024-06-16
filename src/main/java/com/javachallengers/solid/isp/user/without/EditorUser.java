package com.javachallengers.solid.isp.user.without;

class EditorUser implements User {
    @Override
    public void createContent() {
        System.out.println("Editor creates content");
    }

    @Override
    public void editContent() {
        System.out.println("Editor edits content");
    }

    // Editors cannot delete or publish content
    @Override
    public void deleteContent() {
        // Not applicable
    }

    @Override
    public void publishContent() {
        // Not applicable
    }
}