/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dolphin.game.api.types;

import java.awt.Graphics;
import java.awt.Rectangle;

import org.dolphin.game.Game;
import org.dolphin.game.api.components.Actor;
import org.dolphin.game.api.exceptions.DestroyException;
import org.dolphin.game.api.exceptions.RoomChangedException;

/**
 *
 * @author Ali
 */
public class AllOfObject extends Actor {

    public Class theclass;
    public Actor theactor;
    public String name="";

    /*
     * isSameAs is used to check if one Actor is the same as another, very useful for all,allofobject
     * For All it will always be true
     * For an instance it will only be true if they are the same instance
     * For AllOfObject it will only be true if the instance is part of that object
     */
    public boolean isSameAs(Object object){
    	return (Variable.getActor(object).getClass().getName().equals(name));
    }
    
    
    public AllOfObject(Class c){
    theclass=c;
    name = theclass.getName();
    }
    
    public AllOfObject(Actor a){
    	theactor=a;
        theclass=a.getClass();
        name = theclass.getName();
        }
    
    public Actor getActor(){
    	if (theactor !=null)
    	return theactor;
    	else
    		return noone;
    }
    

	
	@Override
	public void addVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].addVariable(name, multValue);
	}

	@Override
	public void Alarm() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Alarm();
	}

	@Override
	public void bandVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].bandVariable(name, multValue);
	}

	@Override
	public void BeginStep() throws DestroyException, RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].BeginStep();
	}

	@Override
	public void borVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].borVariable(name, multValue);
	}

	@Override
	public void bxorVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].bxorVariable(name, multValue);
	}

	@Override
	public void callEvents() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].callEvents();
	}

	@Override
	public void checkCollision() throws DestroyException, RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].checkCollision();
	}

	@Override
	public void checkTimeline() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].checkTimeline();
	}

	@Override
	public void Collision(String name) throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Collision(name);
	}

	@Override
	public void Create() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Create();
	}

	@Override
	public void Destroy() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Destroy();
	}

	@Override
	public void divVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].divVariable(name, multValue);
	}

	@Override
	public void Draw_event(Graphics g) throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Draw_event(g);
	}

	@Override
	public void EndStep() throws DestroyException, RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].EndStep();
	}

	@Override
	public Object getAlarm(int id) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getAlarm(id);
	}

	@Override
	public Object getBbox_bottom() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getBbox_bottom();
	}

	@Override
	public Object getBbox_left() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getBbox_left();
	}

	@Override
	public Object getBbox_right() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getBbox_right();
	}

	@Override
	public Object getBbox_top() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getBbox_top();
	}

	@Override
	public Rectangle getBounds() {
		return super.getBounds();
	}

	@Override
	public Object getDepth() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getDepth();
	}

	@Override
	public Object getDirection() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getDirection();
	}

	@Override
	public Object getFriction() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getFriction();
	}

	@Override
	public Object getGravity_direction() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getGravity_direction();
	}

	@Override
	public Object getGravity() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getGravity();
	}

	@Override
	public Object getHspeed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getHspeed();
	}

	@Override
	public Object getId() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getId();
	}

	@Override
	public Object getImage_alpha() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_alpha();
	}

	@Override
	public Object getImage_angle() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_angle();
	}

	@Override
	public Object getImage_blend() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_blend();
	}

	@Override
	public Object getImage_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_index();
	}

	@Override
	public Object getImage_number() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_number();
	}

	@Override
	public Object getImage_single() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_single();
	}

	@Override
	public Object getImage_speed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_speed();
	}

	@Override
	public Object getImage_xscale() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_xscale();
	}

	@Override
	public Object getImage_yscale() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getImage_yscale();
	}

	@Override
	public Object getMask_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getMask_index();
	}

	@Override
	public Object getObject_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getObject_index();
	}

	@Override
	public Object getPath_endaction() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_endaction();
	}

	@Override
	public Object getPath_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_index();
	}

	@Override
	public Object getPath_orientation() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_orientation();
	}

	@Override
	public Object getPath_position() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_position();
	}

	@Override
	public Object getPath_positionprevious() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_positionprevious();
	}

	@Override
	public Object getPath_scale() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_scale();
	}

	@Override
	public Object getPath_speed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPath_speed();
	}

	@Override
	public Object getPersistent() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getPersistent();
	}

	@Override
	public Object getSolid() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSolid();
	}

	@Override
	public Object getSpeed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSpeed();
	}

	@Override
	public Object getSprite_height() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSprite_height();
	}

	@Override
	public Object getSprite_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSprite_index();
	}

	@Override
	public Object getSprite_width() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSprite_width();
	}

	@Override
	public Object getSprite_xoffset() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSprite_xoffset();
	}

	@Override
	public Object getSprite_yoffset() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getSprite_yoffset();
	}

	@Override
	public Object getTimeline_index() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getTimeline_index();
	}

	@Override
	public Object getTimeline_position() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getTimeline_position();
	}

	@Override
	public Object getTimeline_speed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getTimeline_speed();
	}

	@Override
	public Object getVariable(String name) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getVariable(name);
	}

	@Override
	public Object getVariableOLD(String name) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getVariableOLD(name);
	}

	@Override
	public Object getVisible() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getVisible();
	}

	@Override
	public Object getVspeed() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getVspeed();
	}

	@Override
	public Object getX() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getX();
	}

	@Override
	public Object getXprevious() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getXprevious();
	}

	@Override
	public Object getXstart() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getXstart();
	}

	@Override
	public Object getY() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getY();
	}

	@Override
	public Object getYprevious() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getYprevious();
	}

	@Override
	public Object getYstart() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		if (ac.length <=0) return 0d;
                return ac[0].getYstart();
	}

	@Override
	public void Keyboard() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Keyboard();
	}

	@Override
	public void KeyPressed(int keycode) throws DestroyException,
			RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].KeyPressed(keycode);
	}

	@Override
	public void KeyReleased(int keycode) throws DestroyException,
			RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].KeyReleased(keycode);
	}

	@Override
	public void mouse_Pressed(int keycode, int xx, int yy)
			throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].mouse_Pressed(keycode, xx, yy);
	}

	@Override
	public void Mouse() throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Mouse();
	}

	@Override
	public void Move() {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Move();
	}

	@Override
	public void multVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].multVariable(name, multValue);
	}

	@Override
	public void performAlarm(int alarmid) throws RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].performAlarm(alarmid);
	}

	@Override
	public void setAlarm(int id, Object v) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setAlarm(id, v);
	}

	@Override
	public void setBbox_bottom(Object bbox_bottom) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setBbox_bottom(bbox_bottom);
	}

	@Override
	public void setBbox_left(Object bbox_left) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setBbox_left(bbox_left);
	}

	@Override
	public void setBbox_right(Object bbox_right) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setBbox_right(bbox_right);
	}

	@Override
	public void setBbox_top(Object bbox_top) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setBbox_top(bbox_top);
	}

	@Override
	public void setDepth(Object depth) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setDepth(depth);
	}

	@Override
	public void setDirection(Object direction) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setDirection(direction);
	}

	@Override
	public void setFriction(Object friction) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setFriction(friction);
	}

	@Override
	public void setGravity_direction(Object gravity_direction) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setGravity_direction(gravity_direction);
	}

	@Override
	public void setGravity(Object gravity) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setGravity(gravity);
	}

	@Override
	public void setHspeed(Object hspeed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setHspeed(hspeed);
	}

	@Override
	public void setId(Object id) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setId(id);
	}

	@Override
	public void setImage_alpha(Object image_alpha) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_alpha(image_alpha);
	}

	@Override
	public void setImage_angle(Object image_angle) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_angle(image_angle);
	}

	@Override
	public void setImage_blend(Object image_blend) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_blend(image_blend);
	}

	@Override
	public void setImage_index(Object image_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_index(image_index);
	}

	@Override
	public void setImage_number(Object image_number) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_number(image_number);
	}

	@Override
	public void setImage_single(Object image_single) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_single(image_single);
	}

	@Override
	public void setImage_speed(Object image_speed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_speed(image_speed);
	}

	@Override
	public void setImage_xscale(Object image_xscale) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_xscale(image_xscale);
	}

	@Override
	public void setImage_yscale(Object image_yscale) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setImage_yscale(image_yscale);
	}

	@Override
	public void setMask_index(Object mask_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setMask_index(mask_index);
	}

	@Override
	public void setObject_index(Object object_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setObject_index(object_index);
	}

	@Override
	public void setPath_endaction(Object path_endaction) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_endaction(path_endaction);
	}

	@Override
	public void setPath_index(Object path_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_index(path_index);
	}

	@Override
	public void setPath_orientation(Object path_orientation) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_orientation(path_orientation);
	}

	@Override
	public void setPath_position(Object path_position) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_position(path_position);
	}

	@Override
	public void setPath_positionprevious(Object path_positionprevious) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_positionprevious(path_positionprevious);
	}

	@Override
	public void setPath_scale(Object path_scale) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_scale(path_scale);
	}

	@Override
	public void setPath_speed(Object path_speed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPath_speed(path_speed);
	}

	@Override
	public void setPersistent(Object persistent) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setPersistent(persistent);
	}

	@Override
	public void setSolid(Object solid) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSolid(solid);
	}

	@Override
	public void setSpeed(Object speed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSpeed(speed);
	}

	@Override
	public void setSprite_height(Object sprite_height) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSprite_height(sprite_height);
	}

	@Override
	public void setSprite_index(Object sprite_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSprite_index(sprite_index);
	}

	@Override
	public void setSprite_width(Object sprite_width) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSprite_width(sprite_width);
	}

	@Override
	public void setSprite_xoffset(Object sprite_xoffset) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSprite_xoffset(sprite_xoffset);
	}

	@Override
	public void setSprite_yoffset(Object sprite_yoffset) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setSprite_yoffset(sprite_yoffset);
	}

	@Override
	public void setTimeline_index(Object timeline_index) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setTimeline_index(timeline_index);
	}

	@Override
	public void setTimeline_position(Object timeline_position) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setTimeline_position(timeline_position);
	}

	@Override
	public void setTimeline_speed(Object timeline_speed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setTimeline_speed(timeline_speed);
	}

	@Override
	public void setVariable(String name, int value) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setVariable(name, value);
	}

	@Override
	public void setVariable(String name, Object value) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setVariable(name, value);
	}

	@Override
	public void setVisible(Object visible) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setVisible(visible);
	}

	@Override
	public void setVspeed(Object vspeed) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setVspeed(vspeed);
	}

	@Override
	public void setX(double x) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setX(x);
	}

	@Override
	public void setX(Object x) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setX(x);
	}

	@Override
	public void setXprevious(Object xprevious) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setXprevious(xprevious);
	}

	@Override
	public void setXstart(Object xstart) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setXstart(xstart);
	}

	@Override
	public void setY(double y) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setY(y);
	}

	@Override
	public void setY(Object y) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setY(y);
	}

	@Override
	public void setYprevious(Object yprevious) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setYprevious(yprevious);
	}

	@Override
	public void setYstart(Object ystart) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].setYstart(ystart);
	}

	@Override
	public void Step() throws DestroyException, RoomChangedException {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].Step();
	}

	@Override
	public void subVariable(String name, Object multValue) {
		Actor[] ac =Game.currentRoom.setActorwithname(theclass);
		for (int i = 0; i < ac.length; i++)
                ac[i].subVariable(name, multValue);
	}

	
	
    

}
