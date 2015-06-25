package com.linhnguyen.demo.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentModel {

	private List<EmloyeeModel> emloyeesList;

	public DepartmentModel() {
		emloyeesList = new ArrayList<EmloyeeModel>();
	}

	public List<EmloyeeModel> getEmloyeesList() {
		return emloyeesList;
	}

	public void setEmloyeesList(List<EmloyeeModel> emloyeesList) {
		this.emloyeesList = emloyeesList;
	}

}
