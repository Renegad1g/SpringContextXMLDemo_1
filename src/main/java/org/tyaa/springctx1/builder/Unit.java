package org.tyaa.springctx1.builder;

import org.tyaa.springctx1.interfaces.IPerson;
import org.tyaa.springctx1.interfaces.ITool;
import org.tyaa.springctx1.interfaces.IUnit;

public class Unit implements IUnit {

	private IPerson mPerson;
	private ITool mTool;
	
	private String mNationality;
	private int mLevel;
	
	public Unit() {
		super();
	}

	public Unit(IPerson _person, ITool _tool) {
		super();
		mPerson = _person;
		mTool = _tool;
	}
	
	public Unit(String _nationality, int _level) {
		super();
		mNationality = _nationality;
		mLevel = _level;
	}

	public void testActions() {
		
		mPerson.goTo(10, 25);
		mTool.doAction();
	}

	
	public void say(String _phrase) {
		
		System.out.println(_phrase);
	}

	public ITool getTool() {
		return mTool;
	}

	public void setTool(ITool _tool) {
		mTool = _tool;
	}

	public IPerson getPerson() {
		return mPerson;
	}

	public void setPerson(IPerson _person) {
		mPerson = _person;
	}

	public void show() {
		
		System.out.printf("Nationality: %s; level: %d\n", mNationality, mLevel);
	}
}
