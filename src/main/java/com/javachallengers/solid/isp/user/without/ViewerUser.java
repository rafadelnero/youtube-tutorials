package com.javachallengers.solid.isp.user.without;

class ViewerUser implements User {
    // Viewers cannot create, edit, delete, or publish content
    @Override
    public void createContent() {
        // Not applicable
    }

    @Override
    public void editContent() {
        // Not applicable
    }

    @Override
    public void deleteContent() {
        // Not applicable
    }

    @Override
    public void publishContent() {
        // Not applicable
    }
}
