package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.api.*; import java.awt.Graphics2D; import org.gcreator.compilers.gjava.api.Actor;import org.gcreator.compilers.gjava.api.Object;import org.gcreator.compilers.gjava.api.String;import org.gcreator.compilers.gjava.api.Integer;import org.gcreator.compilers.gjava.api.Double;import org.gcreator.compilers.gjava.api.Boolean;

public class wall_object extends Actor {

    wall_object(int X,int Y,double instance_id) {
        super("wall_object", null,true, true, 0.0 , false);
        xstart = X;xprevious=X;yprevious=Y;
        ystart = Y;
        x = X;
        y = Y;
        this.instance_id = instance_id;
    }
public void checkCollision() { for (int i = 0; i < Game.Current.instances.size(); i++){Actor G_Java_a = ((Actor)Game.Current.instances.elementAt(i)); if (G_Java_a == this) return;}}
public void callEvents() {  checkCollision(); Move(); }
public void KeyPressed(int keycode) {} public void KeyReleased(int keycode) {}

public void Draw_event(Graphics2D g) {
        draw_set_color(getC_green());
        g.draw(getBounds());
        System.out.println("draw_wall");
		}
}
