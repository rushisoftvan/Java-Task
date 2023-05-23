package com.collection.map;

import java.util.Comparator;

public class ManagerComparator  implements Comparator<Manager>{

	@Override
	public int compare(Manager manager1, Manager manager2) {
		return manager1.getAge().compareTo(manager2.getAge());
	}

}
