package com.javachallengers.solid.isp.user.with;

class AdminUser implements ContentCreator, ContentEditor, ContentDeleter, ContentPublisher {
    @Override
    public void createContent() {
        System.out.println("Admin creates content");
    }

    @Override
    public void editContent() {
        System.out.println("Admin edits content");
    }

    @Override
    public void deleteContent() {
        System.out.println("Admin deletes content");
    }

    @Override
    public void publishContent() {
        System.out.println("Admin publishes content");
    }
}