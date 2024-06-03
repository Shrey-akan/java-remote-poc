public enum Commands {
    PRESS_MOUSE(-1),
    RELEASE_MOUSE(-2),
    PRESS_KEY(-3),
    RELEASE_KEY(-4),
    MOVE_MOUSE(-5),
    CLICK_MOUSE(-6),    // Added for mouse click
    DRAG_MOUSE(-7);     // Added for mouse drag

    private int abbrev;

    Commands(int abbrev) {
        this.abbrev = abbrev;
    }

    public int getAbbrev() {
        return abbrev;
    }
}
