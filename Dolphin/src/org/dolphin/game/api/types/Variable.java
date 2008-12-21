package org.dolphin.game.api.types;

import java.io.Serializable;

/**
 * The Basic Object Class
 * 
 * @author TGMG
 */
public class Variable implements Cloneable, Comparable, Serializable {
private static final long serialVersionUID = 1L;

	/*
	 * This method is used for more complex gcl functions, not needed yet
	 */
	public void setVariable(String name, Variable value) {
	}

	/*
	 * This function is required, it sets the value of variable with string
	 * name.
	 */
	public void setVariable(java.lang.String name, Variable value) {
	}

	/*
	 * 
	 * Gets the value of the variable with String name.
	 * 
	 */
	public Variable getVariable(String name) {
		return new Variable();
	}

	/*
	 * 
	 * Gets the value of the variable with string name.
	 * 
	 */
	public Variable getVariable(java.lang.String name) {
		return new Variable();
	}

	/**
	 * Check if obj is instance of this Variable
	 * 
	 * @param obj -
	 *            the Variable to check
	 * @return
	 */
	public boolean isInstanceOf(Variable obj) {
		return (obj instanceof Variable);
	}

	/**
	 * If the Variables are equal
	 * 
	 * @param obj
	 * @return
	 */
	public Boolean equals(Variable obj) {
		return new Boolean(this == (obj));
	}

	/**
	 * If the value is not equal to the obj or not
	 * 
	 * @return
	 */
	public Boolean notequals(Variable obj) {
		return new Boolean(!(super.equals(obj)));
	}

	/**
	 * Not function, turns true to false etc
	 * 
	 * @return
	 */
	public Variable not() {
		return new Boolean(!this.getBoolean());
	}

	/**
	 * negate the value of this Variable
	 * 
	 * @return
	 */
	public Variable negate() {
		return this;
	}

	/**
	 * bnegate
	 * 
	 * @return
	 */
	public Variable bnegate() {
		return this;
	}

	/**
	 * Greater than
	 * 
	 * @param obj -
	 *            Variable to check
	 * @return
	 */
	public Boolean gt(Variable obj) {
		System.out.println("wrong gt");
		return new Boolean(false);
	}

	/**
	 * Greater than equal to
	 * 
	 * @param obj -
	 *            Variable to check
	 * @return
	 */
	public Boolean gte(Variable obj) {
		return new Boolean(false);
	}

	/**
	 * less than
	 * 
	 * @param obj -
	 *            Variable to check
	 * @return
	 */
	public Boolean lt(Variable obj) {
		System.out.println("wrong lt");
		return new Boolean(false);
	}

	/**
	 * less than equal to
	 * 
	 * @param obj -
	 *            Variable to check
	 * @return
	 */
	public Boolean lte(Variable obj) {
		return new Boolean(false);
	}

	/**
	 * Subtract
	 * 
	 * @param o -
	 *            Variable to subtract by
	 * @return
	 */
	public Variable sub(Variable o) {
		return o;
	}

	/**
	 * Add
	 * 
	 * @param o -
	 *            Variable to add
	 * @return
	 */
	public Variable add(Variable o) {
		return o;
	}

	/**
	 * Multiply
	 * 
	 * @param o -
	 *            Variable to multiply by
	 * @return
	 */
	public Variable mult(Variable o) {
		return o;
	}

	/**
	 * Divide
	 * 
	 * @param o -
	 *            Variable to divide by
	 * @return
	 */
	public Variable div(Variable o) {
		return o;
	}

	/**
	 * Set Subtract (-=)
	 * 
	 * @param o
	 * @return
	 */
	public Variable setsub(Variable o) {
		return o;
	}

	/**
	 * Set Add (+=)
	 * 
	 * @param o
	 * @return
	 */
	public Variable setadd(Variable o) {
		return o;
	}

	/**
	 * Set Multiply (*=)
	 * 
	 * @param o
	 * @return
	 */
	public Variable setmult(Variable o) {
		return o;
	}

	/**
	 * Set Divide (/=)
	 * 
	 * @param o
	 * @return
	 */
	public Variable setdiv(Variable o) {
		return o;
	}

	/**
	 * Boolean and
	 * 
	 * @param o
	 * @return
	 */
	public Variable and(Variable o) {
		return o;
	}

	/**
	 * Boolean or
	 * 
	 * @param o
	 * @return
	 */
	public Variable or(Variable o) {
		return o;
	}

	/**
	 * Boolean xor
	 * 
	 * @param o
	 * @return
	 */
	public Variable xor(Variable o) {
		return o;
	}

	/**
	 * Bitwise and
	 * 
	 * @param o
	 * @return
	 */
	public Variable band(Variable o) {
		return o;
	}

	/**
	 * Bitwise or
	 * 
	 * @param o
	 * @return
	 */
	public Variable bor(Variable o) {
		return o;
	}

	/**
	 * Bitwise xor
	 * 
	 * @param o
	 * @return
	 */
	public Variable bxor(Variable o) {
		return o;
	}

	/**
	 * Set Bitwise and
	 * 
	 * @param o
	 * @return
	 */
	public Variable setband(Variable o) {
		return o;
	}

	/**
	 * Set Bitwise or
	 * 
	 * @param o
	 * @return
	 */
	public Variable setbor(Variable o) {
		return o;
	}

	/**
	 * Bitwise xor
	 * 
	 * @param o
	 * @return
	 */
	public Variable setbxor(Variable o) {
		return o;
	}

	/**
	 * Mod function
	 * 
	 * @param o
	 * @return
	 */
	public Variable mod(Variable o) {
		return o;
	}

	public Variable bleft(Variable o) {
		return o;
	}

	public Variable bright(Variable o) {
		return o;
	}

	public double getDouble() {
		return 0;
	}

	public int getInt() {
		return (int) getDouble();
	}

	public float getFloat() {
		return 0;
	}

	public boolean getBoolean() {
		return false;
	}

	public String getString() {
		return new String("");
	}

	/**
	 * Returns the type of the Variable (Integer, Double etc)
	 * 
	 * @return
	 */
	public java.lang.String getType() {
		return "Variable";
	}

	@Override
	public java.lang.String toString() {
		return getType() + ":" + getDouble();
	}

	/** Unless overriden, order is by toString (no meaningful order) */
	public int compareTo(java.lang.Object o) {
		return toString().compareTo(o.toString());
	}

}
