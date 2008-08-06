package org.gcreator.compilers.gjava;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.api.*; import java.awt.Graphics2D; import org.gcreator.compilers.gjava.api.Actor;import org.gcreator.compilers.gjava.api.Object;import org.gcreator.compilers.gjava.api.String;import org.gcreator.compilers.gjava.api.Integer;import org.gcreator.compilers.gjava.api.Double;import org.gcreator.compilers.gjava.api.Boolean;

public class ball_object extends Actor {

    ball_object(int X,int Y,double instance_id) {
        super("ball_object", Game.ball,false, true, 0.0 , false);
        xstart = X;xprevious=X;yprevious=Y;
        ystart = Y;
        x = X;
        y = Y;
        this.instance_id = instance_id;
    }
  public void Create()
    {

 action_move((new String("111101111")), (new Integer(8)));
    }
  public void CollisionWithwall_object(Actor other){this.other=other;
  if (other.getBounds().intersects(getBounds()) && other instanceof wall_object)
  {  if (other.getSolid().getBoolean()){x=xprevious;y=yprevious;System.out.println("solid");
  }
    {
System.out.println("bounds:"+getBounds());
System.out.println("other:"+other.getBounds());
//x=100;y=100;
// action_bounce((new Integer(0)), (new Integer(0)));
    }
    }
    }
  public void Mouse5006() {
if (Game.game.getGame().checkPosMouse(getBounds().x, getBounds().y, getBounds().x+getBounds().width, getBounds().y+getBounds().height) && Game.game.getGame().bsInput.isMouseDown(java.awt.event.MouseEvent.BUTTON1))
    {
show_message(new String("Mouse!"));
 action_sound(self.getVariable("hit"), (new Integer(0)));
 action_set_score((new Integer(1)));
 action_move_random((new Integer(0)), (new Integer(0)));
 action_move((new String("111101111")), (new Integer(8)));
    }
    }
public void checkCollision() { for (int i = 0; i < Game.Current.instances.size(); i++){Actor G_Java_a = ((Actor)Game.Current.instances.elementAt(i)); if (G_Java_a == this) return;CollisionWithwall_object(G_Java_a); }}
public void callEvents() { Mouse5006();  checkCollision();Move();  }
public void KeyPressed(int keycode) {} public void KeyReleased(int keycode) {}

public void Draw_event(Graphics2D g) {
        draw_set_color(getC_green());
        g.draw(getBounds());
        g.drawString("hmmmmmmmm", 100, 100);
        //System.out.println("draw ball");
		}

}
