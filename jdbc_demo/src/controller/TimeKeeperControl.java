package controller;

import java.sql.SQLException;

import controller.dao.DAOTimeKeeper;
import controller.utils.ConnectionUtils;
import model.Timekeeper;
import view.TimeKeeperView;

public class TimeKeeperControl {
	TimeKeeperView view;
	DAOTimeKeeper dao;
	Timekeeper[] timekeepers;
	public TimeKeeperControl(TimeKeeperView view) {
		try {
			dao = new DAOTimeKeeper(ConnectionUtils.getMyConnection());
			this.view = view;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.dao.closeConnection();
			System.exit(0);
		}
	}

	public void run(){
		int choice = -1;
		do {
			choice = view.menu();
			switch (choice) {
			case 1:
				timekeepers=this.displayAll();
				if(!timekeepers.equals(null)){
					for (int i = 0; i < timekeepers.length; i++) {
						this.view.showMessage(timekeepers[i].toString());
					}
				}
				break;

			case 2:
				Timekeeper e = this.view.input(2);
				timekeepers=this.displayByName(new java.sql.Date(e.getDate_Time().getTime()).toString());
				if(!timekeepers.equals(null)){
					for (int i = 0; i < timekeepers.length; i++) {
						this.view.showMessage(timekeepers[i].toString());
					}
				}
				break;
			case 3: 
				Timekeeper insertE = this.view.input(3);
				int rowCout = this.dao.insert(insertE);
				this.view.showMessage(rowCout+ " row has been inserted");
				break;
			case 4:
				Timekeeper upE = this.view.input(4);
				int updateCount = this.dao.update(upE);
				this.view.showMessage(updateCount+ " row has been inserted");
				break;
			default:
				break;
			}
		} while (choice!=0);
	}
	
	private Timekeeper[] displayAll(){
		return this.dao.selectAll();
	}
	private Timekeeper[] displayByName(String name){
		return this.dao.selectByName(name);
	}
	public void exit(){
		this.dao.closeConnection();
		this.view.exit();
	}
}
