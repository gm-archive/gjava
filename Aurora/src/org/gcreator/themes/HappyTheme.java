package org.gcreator.themes;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.OceanTheme;
import sun.swing.SwingUtilities2;
import sun.swing.PrintColorUIResource;

/**
 * The Happy Theme is theme composes mainly of 'cheerful', happy colors.
 * It is based on (or ripped off) the OceanTheme.
 * 
 * <p>
 * Feel free to modify this theme if you do not think it is 'cheerful' enough.
 * </p>
 * @author Serge Humphrey
 * @author Who ever wrote the OceanTheme.
 */

public class HappyTheme extends OceanTheme {
    protected static final ColorUIResource PRIMARY1 =
                              new ColorUIResource(0x6382BF);
    protected static final ColorUIResource PRIMARY2 =
                              new ColorUIResource(0xA89A6E0);
    protected static final ColorUIResource PRIMARY3 =
                              new ColorUIResource(0xD5E5ED);
    protected static final ColorUIResource SECONDARY1 =
                              new ColorUIResource(0x7A8A99);
    protected static final ColorUIResource SECONDARY2 =
                              new ColorUIResource(0xB8CFE5);
    protected static final ColorUIResource SECONDARY3 =
                              new ColorUIResource(0xE8F0F7);

    protected static final ColorUIResource CONTROL_TEXT_COLOR =
                              new PrintColorUIResource(0x333333, Color.BLACK);
    protected static final ColorUIResource INACTIVE_CONTROL_TEXT_COLOR =
                              new ColorUIResource(0x377899);
    protected static final ColorUIResource MENU_DISABLED_FOREGROUND =
                              new ColorUIResource(0x999999);
    protected static final ColorUIResource OCEAN_BLACK =
                              new PrintColorUIResource(0x333333, Color.BLACK);

    protected static final ColorUIResource OCEAN_DROP =
                              new ColorUIResource(0xD2E9FF);
    protected static final ColorUIResource WHITE = new ColorUIResource(0xFFFFFF);
    // ComponentOrientation Icon
    // Delegates to different icons based on component orientation
    protected static class COIcon extends IconUIResource {
        private Icon rtl;

        public COIcon(Icon ltr, Icon rtl) {
            super(ltr);
            this.rtl = rtl;
        }

        public void paintIcon(Component c, Graphics g, int x, int y) {        
            if (isLeftToRight(c)) {
                super.paintIcon(c, g, x, y);
            } else {
                rtl.paintIcon(c, g, x, y);
            }
        }
    }

    // InternalFrame Icon
    // Delegates to different icons based on button state
    protected static class IFIcon extends IconUIResource {
        private Icon pressed;

        public IFIcon(Icon normal, Icon pressed) {
            super(normal);
            this.pressed = pressed;
        }
        
        public void paintIcon(Component c, Graphics g, int x, int y) {
            ButtonModel model = ((AbstractButton)c).getModel();
            if (model.isPressed() && model.isArmed()) {
                pressed.paintIcon(c, g, x, y);
            } else {
                super.paintIcon(c, g, x, y);
            }
        }
    }

    /**
     * Creates an instance of <code>OceanTheme</code>
     */
    public HappyTheme() {
    }
    
    /**
     * Add this theme's custom entries to the defaults table.
     *
     * @param table the defaults table, non-null
     * @throws NullPointerException if {@code table} is {@code null}
     */
    public void addCustomEntriesToTable(UIDefaults table) {
        Object focusBorder = new UIDefaults.ProxyLazyValue(
                      "javax.swing.plaf.BorderUIResource$LineBorderUIResource",
                      new Object[] {getPrimary1()});
        // .30 0 DDE8F3 white secondary2
        java.util.List buttonGradient = Arrays.asList(
                 new Object[] {new Float(0.65), new Float(0.8),
                         getWhite(), new ColorUIResource(0xC8E5FF),  getSecondary2()});

        // Other possible properties that aren't defined:
        //
        // Used when generating the disabled Icons, provides the region to
        // constrain grays to.
        // Button.disabledGrayRange -> Object[] of Integers giving min/max
        // InternalFrame.inactiveTitleGradient -> Gradient when the
        //   internal frame is inactive.
        Color cccccc = new ColorUIResource(0xCCCCCC);
        Color dadada = new ColorUIResource(0xDADADA);
        Color menubarBottom = new ColorUIResource(0xB9CBDA);
        Color c8ddf2 = new ColorUIResource(0xC8DDF2);
        Color $8fc6e2 = new ColorUIResource(0x8FC6E2);
        java.util.List sliderGradient = Arrays.asList(new Object[] {
            new Float(.3f), new Float(.2f),
            c8ddf2, getWhite(), new ColorUIResource(SECONDARY2) });

        Object[] defaults = new Object[] {
            "Button.gradient", buttonGradient,
            "Button.rollover", Boolean.TRUE,
            "Button.toolBarBorderBackground", INACTIVE_CONTROL_TEXT_COLOR, 
            "Button.disabledToolBarBorderBackground", cccccc,
            "Button.rolloverIconType", "ocean",

            "CheckBox.rollover", Boolean.TRUE,
            "CheckBox.gradient", buttonGradient,

            "CheckBoxMenuItem.gradient", buttonGradient,

            "Label.disabledForeground", getInactiveControlTextColor(),
            
            "Menu.opaque", Boolean.FALSE,

            "MenuBar.gradient", Arrays.asList(new Object[] {
                     new Float(1f), new Float(0f),
                     getWhite(), menubarBottom, 
                     new ColorUIResource(menubarBottom) }),
            "MenuBar.borderColor", cccccc,

            "InternalFrame.activeTitleGradient", buttonGradient,

            "List.focusCellHighlightBorder", focusBorder,

            "MenuBarUI", "javax.swing.plaf.metal.MetalMenuBarUI",

            "RadioButton.gradient", buttonGradient,
            "RadioButton.rollover", Boolean.TRUE,

            "RadioButtonMenuItem.gradient", buttonGradient,

            "ScrollBar.gradient", buttonGradient,

            "Slider.altTrackColor", new ColorUIResource(0xD2E2EF),
            "Slider.gradient", sliderGradient,
            "Slider.focusGradient", sliderGradient,

            "SplitPane.oneTouchButtonsOpaque", Boolean.FALSE,
            "SplitPane.dividerFocusColor", c8ddf2,

            "TabbedPane.borderHightlightColor", getPrimary1(),
            "TabbedPane.contentAreaColor", $8fc6e2,
            "TabbedPane.contentBorderInsets", new Insets(4, 2, 3, 3),
            "TabbedPane.selected", $8fc6e2,
            "TabbedPane.tabAreaBackground", dadada,
            "TabbedPane.tabAreaInsets", new Insets(2, 2, 0, 6),
            "TabbedPane.unselectedBackground", SECONDARY3,

            "Table.focusCellHighlightBorder", focusBorder,
            "Table.gridColor", SECONDARY1,
            "TableHeader.focusCellBackground", c8ddf2,

            "ToggleButton.gradient", buttonGradient,

            "ToolBar.borderColor", cccccc,
            "ToolBar.isRollover", Boolean.TRUE,
            "Tree.selectionBorderColor", getPrimary1(),
            "Tree.dropLineColor", getPrimary1(),
            "Table.dropLineColor", getPrimary1(),
            "Table.dropLineShortColor", OCEAN_BLACK,
            
            "Table.dropCellBackground", OCEAN_DROP,
            "Tree.dropCellBackground", OCEAN_DROP,
            "List.dropCellBackground", OCEAN_DROP,
            "List.dropLineColor", getPrimary1()
        
        
        
        };
        table.putDefaults(defaults);
    }

    /**
     * Overriden to enable picking up the system fonts, if applicable.
     */
    boolean isSystemTheme() {
        return true;
    }

    /**
     * Return the name of this theme, "Happy".
     *
     * @return "Happy"
     */
    @Override
    public String getName() {
        return "Happy";
    }

    /**
     * Returns the primary 1 color. This returns a color with an rgb hex value
     * of {@code 0x6382BF}.
     *
     * @return the primary 1 color
     * @see java.awt.Color#decode
     */
    @Override
    protected ColorUIResource getPrimary1() {
        return PRIMARY1;
    } 

    /**
     * Returns the primary 2 color. This returns a color with an rgb hex value
     * of {@code 0x89A6E0}.
     *
     * @return the primary 2 color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getPrimary2() {
        return PRIMARY2;
    }

    /**
     * Returns the primary 3 color. This returns a color with an rgb hex value
     * of {@code 0xD5E5ED}.
     *
     * @return the primary 3 color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getPrimary3() {
        return PRIMARY3;
    }

    /**
     * Returns the secondary 1 color. This returns a color with an rgb hex
     * value of {@code 0x7A8A99}.
     *
     * @return the secondary 1 color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getSecondary1() {
        return SECONDARY1;
    }

    /**
     * Returns the secondary 2 color. This returns a color with an rgb hex
     * value of {@code 0xB8CFE5}.
     *
     * @return the secondary 2 color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getSecondary2() {
        return SECONDARY2;
    }

    /**
     * Returns the secondary 3 color. This returns a color with an rgb hex
     * value of {@code 0xE8F0F7}.
     *
     * @return the secondary 3 color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getSecondary3() {
        return SECONDARY3;
    }

    /**
     * Returns the black color. This returns a color with an rgb hex
     * value of {@code 0x333333}.
     *
     * @return the black color
     * @see java.awt.Color#decode
     */
    protected ColorUIResource getBlack() {
        return OCEAN_BLACK;
    }

    /**
     * Returns the inactive control text color. This returns a color with an
     * rgb hex value of {@code 0x999999}.
     *
     * @return the inactive control text color
     */
    public ColorUIResource getInactiveControlTextColor() {
        return INACTIVE_CONTROL_TEXT_COLOR;
    }

    /**
     * Returns the control text color. This returns a color with an
     * rgb hex value of {@code 0x333333}.
     *
     * @return the control text color
     */
    public ColorUIResource getControlTextColor() {
        return CONTROL_TEXT_COLOR;
    }

    /**
     * Returns the menu disabled foreground color. This returns a color with an
     * rgb hex value of {@code 0x999999}.
     *
     * @return the menu disabled foreground color
     */
    public ColorUIResource getMenuDisabledForeground() {
        return MENU_DISABLED_FOREGROUND;
    }

    private Object getIconResource(String iconID) {
        return SwingUtilities2.makeIcon(getClass(), OceanTheme.class, iconID);
    }

    // makes use of getIconResource() to fetch an icon and then hastens it
    // - calls createValue() on it and returns the actual icon
    private Icon getHastenedIcon(String iconID, UIDefaults table) {
        Object res = getIconResource(iconID);
        return (Icon)((UIDefaults.LazyValue)res).createValue(table);
    }
    
    /**
     *  Same as getName().
     *  @return getName()
     *  @see getName();
     */
    @Override
    public String toString() {
        return getName();
    }
    
    /*
     * Convenience function for determining ComponentOrientation.  Helps us
     * avoid having Munge directives throughout the code.
     */
    static boolean isLeftToRight( Component c ) {
        return c.getComponentOrientation().isLeftToRight();
    }
}