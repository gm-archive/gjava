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
 * This is used to set values for all objects at once or to set all of a specific type of object
 * @author Ali
 */
public class All extends Actor {

	Class objectname=null;//null when all
	
	/*
     * isSameAs is used to check if one Actor is the same as another, very useful for all,allofobject
     * For All it will always be true
     * For an instance it will only be true if they are the same instance
     * For AllOfObject it will only be true if the instance is part of that object
     */
    public boolean isSameAs(Object object){
    	return true;
    }
	
	@Override
	public void addVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).addVariable(name, multValue);
	}

	@Override
	public void Alarm() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Alarm();
	}

	@Override
	public void bandVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).bandVariable(name, multValue);
	}

	@Override
	public void BeginStep() throws DestroyException, RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).BeginStep();
	}

	@Override
	public void borVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).borVariable(name, multValue);
	}

	@Override
	public void bxorVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).bxorVariable(name, multValue);
	}

	@Override
	public void callEvents() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).callEvents();
	}

	@Override
	public void checkCollision() throws DestroyException, RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).checkCollision();
	}

	@Override
	public void checkTimeline() {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).checkTimeline();
	}

	@Override
	public void Collision(String name) throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Collision(name);
	}

	@Override
	public void Create() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Create();
	}

	@Override
	public void Destroy() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Destroy();
	}

	@Override
	public void divVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).divVariable(name, multValue);
	}

	@Override
	public void Draw_event(Graphics g) throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Draw_event(g);
	}

	@Override
	public void EndStep() throws DestroyException, RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).EndStep();
	}

	@Override
	public Actor getActor() {
		// TODO Auto-generated method stub
		return all;
	}

	@Override
	public Object getAlarm(int id) {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getAlarm(id);
	}

	@Override
	public Object getBbox_bottom() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getBbox_bottom();
	}

	@Override
	public Object getBbox_left() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getBbox_left();
	}

	@Override
	public Object getBbox_right() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getBbox_right();
	}

	@Override
	public Object getBbox_top() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getBbox_top();
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return super.getBounds();
	}

	@Override
	public Object getDepth() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getDepth();
	}

	@Override
	public Object getDirection() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getDirection();
	}

	@Override
	public Object getFriction() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getFriction();
	}

	@Override
	public Object getGravity_direction() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getGravity_direction();
	}

	@Override
	public Object getGravity() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getGravity();
	}

	@Override
	public Object getHspeed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getHspeed();
	}

	@Override
	public Object getId() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getId();
	}

	@Override
	public Object getImage_alpha() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_alpha();
	}

	@Override
	public Object getImage_angle() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_angle();
	}

	@Override
	public Object getImage_blend() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_blend();
	}

	@Override
	public Object getImage_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_index();
	}

	@Override
	public Object getImage_number() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_number();
	}

	@Override
	public Object getImage_single() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_single();
	}

	@Override
	public Object getImage_speed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_speed();
	}

	@Override
	public Object getImage_xscale() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_xscale();
	}

	@Override
	public Object getImage_yscale() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getImage_yscale();
	}

	@Override
	public Object getMask_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getMask_index();
	}

	@Override
	public Object getObject_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getObject_index();
	}

	@Override
	public Object getPath_endaction() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_endaction();
	}

	@Override
	public Object getPath_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_index();
	}

	@Override
	public Object getPath_orientation() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_orientation();
	}

	@Override
	public Object getPath_position() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_position();
	}

	@Override
	public Object getPath_positionprevious() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_positionprevious();
	}

	@Override
	public Object getPath_scale() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_scale();
	}

	@Override
	public Object getPath_speed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPath_speed();
	}

	@Override
	public Object getPersistent() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getPersistent();
	}

	@Override
	public Object getSolid() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSolid();
	}

	@Override
	public Object getSpeed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSpeed();
	}

	@Override
	public Object getSprite_height() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSprite_height();
	}

	@Override
	public Object getSprite_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSprite_index();
	}

	@Override
	public Object getSprite_width() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSprite_width();
	}

	@Override
	public Object getSprite_xoffset() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSprite_xoffset();
	}

	@Override
	public Object getSprite_yoffset() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getSprite_yoffset();
	}

	@Override
	public Object getTimeline_index() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getTimeline_index();
	}

	@Override
	public Object getTimeline_position() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getTimeline_position();
	}

	@Override
	public Object getTimeline_speed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getTimeline_speed();
	}

	@Override
	public Object getVariable(String name) {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getVariable(name);
	}

	@Override
	public Object getVariableOLD(String name) {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getVariableOLD(name);
	}

	@Override
	public Object getVisible() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getVisible();
	}

	@Override
	public Object getVspeed() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getVspeed();
	}

	@Override
	public Object getX() {
            if (Game.currentRoom.instances.firstElement() ==null) return 0d;
                return (Game.currentRoom.instances.firstElement()).getX();
	}

	@Override
	public Object getXprevious() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getXprevious();
	}

	@Override
	public Object getXstart() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getXstart();
	}

	@Override
	public Object getY() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getY();
	}

	@Override
	public Object getYprevious() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getYprevious();
	}

	@Override
	public Object getYstart() {
		if (Game.currentRoom.instances.firstElement() ==null) return 0d;
        return (Game.currentRoom.instances.firstElement()).getYstart();
	}

	@Override
	public void Keyboard() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Keyboard();
	}

	@Override
	public void KeyPressed(int keycode) throws DestroyException,
			RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).KeyPressed(keycode);
	}

	@Override
	public void KeyReleased(int keycode) throws DestroyException,
			RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).KeyReleased(keycode);
	}

	@Override
	public void mouse_Pressed(int keycode, int xx, int yy)
			throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).mouse_Pressed(keycode, xx, yy);
	}

	@Override
	public void Mouse() throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Mouse();
	}

	@Override
	public void Move() {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Move();
	}

	@Override
	public void multVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).multVariable(name, multValue);
	}

	@Override
	public void performAlarm(int alarmid) throws RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).performAlarm(alarmid);
	}

	@Override
	public void setAlarm(int id, Object v) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setAlarm(id, v);
	}

	@Override
	public void setBbox_bottom(Object bbox_bottom) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setBbox_bottom(bbox_bottom);
	}

	@Override
	public void setBbox_left(Object bbox_left) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setBbox_left(bbox_left);
	}

	@Override
	public void setBbox_right(Object bbox_right) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setBbox_right(bbox_right);
	}

	@Override
	public void setBbox_top(Object bbox_top) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setBbox_top(bbox_top);
	}

	@Override
	public void setDepth(Object depth) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setDepth(depth);
	}

	@Override
	public void setDirection(Object direction) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setDirection(direction);
	}

	@Override
	public void setFriction(Object friction) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setFriction(friction);
	}

	@Override
	public void setGravity_direction(Object gravity_direction) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setGravity_direction(gravity_direction);
	}

	@Override
	public void setGravity(Object gravity) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setGravity(gravity);
	}

	@Override
	public void setHspeed(Object hspeed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setHspeed(hspeed);
	}

	@Override
	public void setId(Object id) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setId(id);
	}

	@Override
	public void setImage_alpha(Object image_alpha) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_alpha(image_alpha);
	}

	@Override
	public void setImage_angle(Object image_angle) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_angle(image_angle);
	}

	@Override
	public void setImage_blend(Object image_blend) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_blend(image_blend);
	}

	@Override
	public void setImage_index(Object image_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_index(image_index);
	}

	@Override
	public void setImage_number(Object image_number) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_number(image_number);
	}

	@Override
	public void setImage_single(Object image_single) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_single(image_single);
	}

	@Override
	public void setImage_speed(Object image_speed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_speed(image_speed);
	}

	@Override
	public void setImage_xscale(Object image_xscale) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_xscale(image_xscale);
	}

	@Override
	public void setImage_yscale(Object image_yscale) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setImage_yscale(image_yscale);
	}

	@Override
	public void setMask_index(Object mask_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setMask_index(mask_index);
	}

	@Override
	public void setObject_index(Object object_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setObject_index(object_index);
	}

	@Override
	public void setPath_endaction(Object path_endaction) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_endaction(path_endaction);
	}

	@Override
	public void setPath_index(Object path_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_index(path_index);
	}

	@Override
	public void setPath_orientation(Object path_orientation) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_orientation(path_orientation);
	}

	@Override
	public void setPath_position(Object path_position) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_position(path_position);
	}

	@Override
	public void setPath_positionprevious(Object path_positionprevious) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_positionprevious(path_positionprevious);
	}

	@Override
	public void setPath_scale(Object path_scale) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_scale(path_scale);
	}

	@Override
	public void setPath_speed(Object path_speed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPath_speed(path_speed);
	}

	@Override
	public void setPersistent(Object persistent) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setPersistent(persistent);
	}

	@Override
	public void setSolid(Object solid) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSolid(solid);
	}

	@Override
	public void setSpeed(Object speed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSpeed(speed);
	}

	@Override
	public void setSprite_height(Object sprite_height) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSprite_height(sprite_height);
	}

	@Override
	public void setSprite_index(Object sprite_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSprite_index(sprite_index);
	}

	@Override
	public void setSprite_width(Object sprite_width) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSprite_width(sprite_width);
	}

	@Override
	public void setSprite_xoffset(Object sprite_xoffset) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSprite_xoffset(sprite_xoffset);
	}

	@Override
	public void setSprite_yoffset(Object sprite_yoffset) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setSprite_yoffset(sprite_yoffset);
	}

	@Override
	public void setTimeline_index(Object timeline_index) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setTimeline_index(timeline_index);
	}

	@Override
	public void setTimeline_position(Object timeline_position) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setTimeline_position(timeline_position);
	}

	@Override
	public void setTimeline_speed(Object timeline_speed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setTimeline_speed(timeline_speed);
	}

	@Override
	public void setVariable(String name, int value) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setVariable(name, value);
	}

	@Override
	public void setVariable(String name, Object value) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setVariable(name, value);
	}

	@Override
	public void setVisible(Object visible) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setVisible(visible);
	}

	@Override
	public void setVspeed(Object vspeed) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setVspeed(vspeed);
	}

	@Override
	public void setX(double x) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setX(x);
	}

	@Override
	public void setX(Object x) {
		
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setX(x);
	}

	@Override
	public void setXprevious(Object xprevious) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setXprevious(xprevious);
	}

	@Override
	public void setXstart(Object xstart) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setXstart(xstart);
	}

	@Override
	public void setY(double y) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setY(y);
	}

	@Override
	public void setY(Object y) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setY(y);
	}

	@Override
	public void setYprevious(Object yprevious) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setYprevious(yprevious);
	}

	@Override
	public void setYstart(Object ystart) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).setYstart(ystart);
	}

	@Override
	public void Step() throws DestroyException, RoomChangedException {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).Step();
	}

	@Override
	public void subVariable(String name, Object multValue) {
		for (int i = 0; i < Game.currentRoom.instances.size(); i++)
            if (Game.currentRoom.instances.elementAt(i) !=null)
                (Game.currentRoom.instances.elementAt(i)).subVariable(name, multValue);
	}

	
	
	
}
