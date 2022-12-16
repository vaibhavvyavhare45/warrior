package com.warrior.ownimmtableclass;

public final class Employee {
	private final int eid;
	private final String ename;
	private final Address address;

	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;

		Address clonnAdder = new Address();
		clonnAdder.setPin(address.getPin());
		clonnAdder.setCity(address.getCity());
		this.address = clonnAdder;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Address getAddress() {
		Address dummyAdder = new Address();
		dummyAdder.setPin(this.address.getPin());
		dummyAdder.setCity(this.address.getCity());
		return dummyAdder;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

}