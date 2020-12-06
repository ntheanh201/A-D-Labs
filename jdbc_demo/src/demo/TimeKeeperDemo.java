package demo;

import controller.TimeKeeperControl;
import view.TimeKeeperView;

public class TimeKeeperDemo {
	public static void main(String[] args) {
		TimeKeeperView v = new TimeKeeperView();
		TimeKeeperControl control = new TimeKeeperControl(v);
		control.run();
		control.exit();
	}
}
