package com.springcore.collections.standalone;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feesStr;

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStr=" + feesStr + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeesStr() {
		return feesStr;
	}

	public void setFeesStr(Map<String, Integer> feesStr) {
		this.feesStr = feesStr;
	}
}
